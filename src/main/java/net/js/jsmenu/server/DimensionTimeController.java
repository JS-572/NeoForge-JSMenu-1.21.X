package net.js.jsmenu.server;

import net.js.jsmenu.space.SpaceDimensions;
import net.js.jsmenu.space.planet.Planet;
import net.js.jsmenu.space.planet.Planets;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.LevelTickEvent;

@EventBusSubscriber(modid = "jsmenu", bus = EventBusSubscriber.Bus.GAME)
public class DimensionTimeController {
    private static final double MOON_DAY_LENGTH_TICKS = 648000.0;
    private static final double PHOBOS_DAY_LENGTH_TICKS = 7.653653653653654;
    private static final double DEIMOS_DAY_LENGTH_TICKS = 30.312;

    @SubscribeEvent
    public static void onLevelTick(LevelTickEvent.Post event) {
        if (!(event.getLevel() instanceof ServerLevel level)) return;
        if (level.dimension().equals(Level.OVERWORLD)) return;

        double dayLength = dayLengthFor(level.dimension());
        if (dayLength > 0.0) {
            applyDayLength(level, dayLength);
        }
    }

    public static double dayLengthFor(ResourceKey<Level> dimension) {
        for (Planet planet : Planets.getPlanets()) {
            if (dimension.equals(planet.getSpaceDimension()) || dimension.equals(planet.getLifeDimension())) {
                return planet.getDayLengthTicks();
            }
        }

        if (dimension.equals(SpaceDimensions.MOON) || dimension.equals(SpaceDimensions.MOON_LIFE)
                || dimension.equals(SpaceDimensions.SUN)) {
            return MOON_DAY_LENGTH_TICKS;
        }
        if (dimension.equals(SpaceDimensions.PHOBOS)) {
            return PHOBOS_DAY_LENGTH_TICKS;
        }
        if (dimension.equals(SpaceDimensions.DEIMOS)) {
            return DEIMOS_DAY_LENGTH_TICKS;
        }

        return 0.0;
    }

    private static void applyDayLength(ServerLevel level, double dayLengthTicks) {
        level.setDayTimePerTick((float) (24000.0 / dayLengthTicks));
    }
}
