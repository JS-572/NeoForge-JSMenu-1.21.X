package net.js.jsmenu.space.star;

import net.js.jsmenu.space.SkyObject;
import net.js.jsmenu.space.SpaceObject;
import net.js.jsmenu.space.SpaceObjectType;
import net.js.jsmenu.space.planet.Planet;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class Star extends SpaceObject {
    private final StarClass starClass;
    private final StarType starType;
    private final List<SkyObject> skyObjects = new ArrayList<>();

    public Star(
            String id,
            String displayName,
            double mapX,
            double mapY,
            String description,
            ResourceKey<Level> spaceDimension,
            ResourceKey<Level> lifeDimension,
            StarClass starClass,
            StarType starType
    ) {
        super(
                id,
                displayName,
                SpaceObjectType.STAR,
                mapX,
                mapY,
                description,
                spaceDimension,
                lifeDimension
        );
        this.starClass = starClass;
        this.starType = starType;
    }

    public Star registerSkyObject(SkyObject skyObject) {
        this.skyObjects.add(skyObject);
        return this;
    }

    public List<SkyObject> getSkyObjects() {
        return List.copyOf(this.skyObjects);
    }

    public StarClass getStarClass() {
        return starClass;
    }
    public StarType getStarType() {
        return starType;
    }
}
