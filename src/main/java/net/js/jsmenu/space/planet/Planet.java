package net.js.jsmenu.space.planet;

import net.js.jsmenu.space.SkyObject;
import net.js.jsmenu.space.SpaceObject;
import net.js.jsmenu.space.SpaceObjectType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;

public class Planet extends SpaceObject {
    private final PlanetType planetType;
    private final PlanetRotation rotation;
    private final double dayLengthTicks;
    private final float sunScale;
    private final Vec3 skyColor;
    private final List<SkyObject> skyObjects = new ArrayList<>();

    public Planet(
            String id,
            String displayName,
            double mapX,
            double mapY,
            String description,
            ResourceKey<Level> spaceDimension,
            ResourceKey<Level> lifeDimension,
            PlanetType planetType,
            PlanetRotation rotation,
            double dayLengthTicks,
            float sunScale,
            Vec3 skyColor
    ) {
        super(
                id,
                displayName,
                SpaceObjectType.PLANET,
                mapX,
                mapY,
                description,
                spaceDimension,
                lifeDimension
        );

        this.planetType = planetType;
        this.rotation = rotation;
        this.dayLengthTicks = dayLengthTicks;
        this.sunScale = sunScale;
        this.skyColor = skyColor;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public PlanetRotation getRotation() {
        return rotation;
    }

    public double getDayLengthTicks() {
        return this.dayLengthTicks;
    }

    public float getSunScale() {
        return this.sunScale;
    }

    public Vec3 getSkyColor() {
        return this.skyColor;
    }

    public Planet registerSkyObject(SkyObject skyObject) {
        this.skyObjects.add(skyObject);
        return this;
    }

    public List<SkyObject> getSkyObjects() {
        return List.copyOf(this.skyObjects);
    }
}
