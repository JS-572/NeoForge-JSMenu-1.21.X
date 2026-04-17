package net.js.jsmenu.space.star;

import net.js.jsmenu.space.SpaceObject;
import net.js.jsmenu.space.SpaceObjectType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public class Star extends SpaceObject {
    private final StarClass starClass;

    public Star(
            String id,
            String displayName,
            double mapX,
            double mapY,
            String description,
            ResourceKey<Level> spaceDimension,
            ResourceKey<Level> lifeDimension,
            StarClass starClass
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
    }

    public StarClass getStarClass() {
        return starClass;
    }
}
