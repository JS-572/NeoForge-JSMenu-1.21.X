package net.js.jsmenu;

import net.js.jsmenu.client.DynamicHeldLightHandler;
import net.js.jsmenu.client.HeldLightSphereHandler;
import net.js.jsmenu.client.ModFluidRenderers;
import net.js.jsmenu.space.AverageTimeOfDay;
import net.js.jsmenu.space.SkyObject;
import net.js.jsmenu.space.SkyObjects;
import net.js.jsmenu.space.moon.Moons;
import net.js.jsmenu.space.planet.PlanetSkyEffects;
import net.js.jsmenu.client.space.SpaceScreenController;
import net.js.jsmenu.space.planet.Planet;
import net.js.jsmenu.space.planet.Planets;
import net.js.jsmenu.space.star.Stars;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;

/**
 * Client-side registration helper. Call JSMenuClient.init(modBus) from your main mod constructor
 * passing the IEventBus you receive there.
 */
public class JSMenuClient {
    private static PlanetSkyEffects overworldSkyObjects;

    public static void init(IEventBus modBus) {
        SkyObjects.registerAllSkies();
        overworldSkyObjects = new PlanetSkyEffects(
                Planets.EARTH.getSkyObjects().stream()
                        .filter(object -> !object.id().equals("sun") && !object.id().equals("moon"))
                        .toList()
        );

        modBus.addListener(ModFluidRenderers::onClientSetup);
        DynamicHeldLightHandler.register();
        HeldLightSphereHandler.register();
        SpaceScreenController.init(modBus);
        modBus.addListener(RegisterDimensionSpecialEffectsEvent.class, JSMenuClient::registerPlanetSkyEffects);
        NeoForge.EVENT_BUS.addListener(JSMenuClient::renderOverworldSkyObjects);
    }

    private static void registerPlanetSkyEffects(RegisterDimensionSpecialEffectsEvent event) {
        registerPlanetSkyEffects(event, Planets.MERCURY);
        registerPlanetSkyEffects(event, Planets.VENUS);
        registerPlanetSkyEffects(event, Planets.MARS);

        registerSkyEffects(event, "moon_sky", Moons.MOON.getSkyObjects(), AverageTimeOfDay.MOON_TICKS_PER_DAY);
        registerSkyEffects(event, "moon_life_sky", Moons.MOON.getSkyObjects(), AverageTimeOfDay.MOON_TICKS_PER_DAY);
        registerSkyEffects(event, "phobos_sky", Moons.PHOBOS.getSkyObjects(), AverageTimeOfDay.PHOBOS_TICKS_PER_DAY);
        registerSkyEffects(event, "deimos_sky", Moons.DEIMOS.getSkyObjects(), AverageTimeOfDay.DEIMOS_TICKS_PER_DAY);
        registerSkyEffects(event, "sun_sky", Stars.SUN.getSkyObjects(), AverageTimeOfDay.SUN_TICKS_PER_DAY);
    }

    private static void renderOverworldSkyObjects(RenderLevelStageEvent event) {
        if (event.getStage() != RenderLevelStageEvent.Stage.AFTER_SKY) {
            return;
        }

        var level = Minecraft.getInstance().level;
        if (level == null || level.dimension() != Level.OVERWORLD) {
            return;
        }

        overworldSkyObjects.renderObjects(
                level,
                event.getPartialTick().getGameTimeDeltaPartialTick(false),
                event.getModelViewMatrix()
        );
    }

    private static void registerPlanetSkyEffects(RegisterDimensionSpecialEffectsEvent event, Planet planet) {
        PlanetSkyEffects effects = new PlanetSkyEffects(planet.getSkyObjects(), planet.getDayLengthTicks());
        String effectsPath = planet.getId() + "_sky";
        event.register(ResourceLocation.fromNamespaceAndPath("jsmenu", effectsPath), effects);
        event.register(ResourceLocation.fromNamespaceAndPath("jsmenu", planet.getId() + "_life_sky"), effects);
    }

    private static void registerSkyEffects(
            RegisterDimensionSpecialEffectsEvent event,
            String effectsPath,
            List<SkyObject> skyObjects,
            double dayLengthTicks
    ) {
        event.register(
                ResourceLocation.fromNamespaceAndPath("jsmenu", effectsPath),
                new PlanetSkyEffects(skyObjects, dayLengthTicks)
        );
    }
}
