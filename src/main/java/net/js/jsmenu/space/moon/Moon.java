package net.js.jsmenu.space.moon;

import net.js.jsmenu.space.SkyObject;
import net.js.jsmenu.space.SpaceObject;
import net.js.jsmenu.space.SpaceObjectType;
import net.js.jsmenu.space.star.Star;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class Moon extends SpaceObject {
    private final List<SkyObject> skyObjects = new ArrayList<>();

    public Moon(String id, String displayName, double mapX, double mapY, String description, ResourceKey<Level> spaceDimension, ResourceKey<Level> lifeDimension) {
        super(id, displayName, SpaceObjectType.MOON, mapX, mapY, description, spaceDimension, lifeDimension);
    }

    public Moon registerSkyObject(SkyObject skyObject) {
        this.skyObjects.add(skyObject);
        return this;
    }

    public List<SkyObject> getSkyObjects() {
        return List.copyOf(this.skyObjects);
    }
}
