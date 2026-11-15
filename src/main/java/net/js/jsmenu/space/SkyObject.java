package net.js.jsmenu.space;

import net.minecraft.resources.ResourceLocation;

public record SkyObject(
        String id,
        ResourceLocation texture,
        float size,
        AverageTimeOfDay timeOfDayRising,
        AverageTimeOfDay timeOfDaySetting,
        float skyInclination
) {
    public SkyObject withSize(float size) {
        return new SkyObject(this.id, this.texture, size, this.timeOfDayRising, this.timeOfDaySetting, this.skyInclination);
    }

    public SkyObject withTimes(AverageTimeOfDay timeOfDayRising, AverageTimeOfDay timeOfDaySetting) {
        return new SkyObject(this.id, this.texture, this.size, timeOfDayRising, timeOfDaySetting, this.skyInclination);
    }

    public SkyObject withSkyInclination(float skyInclination) {
        return new SkyObject(this.id, this.texture, this.size, this.timeOfDayRising, this.timeOfDaySetting, skyInclination);
    }
}
