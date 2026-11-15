package net.js.jsmenu.space.planet;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.js.jsmenu.space.SkyObject;
import net.js.jsmenu.item.ModItems;
import net.js.jsmenu.item.custom.TelescopeGoggleItem;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.EquipmentSlot;
import org.joml.Matrix4f;

import java.util.List;
import java.util.OptionalDouble;

public class PlanetSkyEffects extends DimensionSpecialEffects {
    private final List<SkyObject> objects;
    private final Float dayTimePerTick;

    public PlanetSkyEffects(List<SkyObject> objects) {
        super(192.0F, true, SkyType.NONE, false, false);
        this.objects = List.copyOf(objects);
        this.dayTimePerTick = null;
    }

    public PlanetSkyEffects(List<SkyObject> objects, double dayLengthTicks) {
        super(192.0F, true, SkyType.NONE, false, false);
        if (!Double.isFinite(dayLengthTicks) || dayLengthTicks <= 0.0) {
            throw new IllegalArgumentException("Day length must be a positive finite number");
        }
        this.objects = List.copyOf(objects);
        this.dayTimePerTick = (float) (Level.TICKS_PER_DAY / dayLengthTicks);
    }

    @Override
    public boolean renderSky(ClientLevel level, int ticks, float partialTick, Matrix4f modelViewMatrix, Camera camera, Matrix4f projectionMatrix, boolean isFoggy, Runnable setupFog) {
        renderObjects(level, partialTick, modelViewMatrix);
        return false;
    }

    public void renderObjects(ClientLevel level, float partialTick, Matrix4f modelViewMatrix) {
        if (this.dayTimePerTick != null) {
            level.setDayTimePerTick(this.dayTimePerTick);
        }

        var player = Minecraft.getInstance().player;
        float magnification = player != null && player.getItemBySlot(EquipmentSlot.HEAD).is(ModItems.TELESCOPE_GOGGLE.get())
                ? TelescopeGoggleItem.getMagnification()
                : 1.0F;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShader(GameRenderer::getPositionTexShader);

        try {
            for (SkyObject object : this.objects) {
                SkyPosition position = getSkyPosition(object, level, partialTick);
                if (position == null) {
                    continue;
                }
                Matrix4f objectMatrix = new Matrix4f(modelViewMatrix);
                objectMatrix.rotate((float) Math.toRadians(object.skyInclination()), 0.0F, 0.0F, 1.0F);
                objectMatrix.rotate((float) Math.toRadians(-90.0F), 0.0F, 1.0F, 0.0F);
                objectMatrix.rotate((float) Math.toRadians(position.angle()), 1.0F, 0.0F, 0.0F);
                RenderSystem.setShaderTexture(0, object.texture());
                RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                BufferBuilder bufferBuilder = Tesselator.getInstance().begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);
                float size = object.size() * 7.5F * magnification;
                bufferBuilder.addVertex(objectMatrix, -size, 100.0F, -size).setUv(0.0F, 0.0F);
                bufferBuilder.addVertex(objectMatrix, size, 100.0F, -size).setUv(1.0F, 0.0F);
                bufferBuilder.addVertex(objectMatrix, size, 100.0F, size).setUv(1.0F, 1.0F);
                bufferBuilder.addVertex(objectMatrix, -size, 100.0F, size).setUv(0.0F, 1.0F);
                BufferUploader.drawWithShader(bufferBuilder.buildOrThrow());
            }
        } finally {
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    private static SkyPosition getSkyPosition(SkyObject object, ClientLevel level, float partialTick) {
        if (object.timeOfDayRising() == null || object.timeOfDaySetting() == null) {
            return new SkyPosition((float) (timeOfDayTicks(level, partialTick, Level.TICKS_PER_DAY)
                    / Level.TICKS_PER_DAY * 360.0));
        }

        if (!object.timeOfDayRising().hasSameEventSequence(object.timeOfDaySetting())) {
            double ticksPerDay = object.timeOfDayRising().ticksPerDay();
            return new SkyPosition((float) (timeOfDayTicks(level, partialTick, ticksPerDay) / ticksPerDay * 360.0));
        }

        OptionalDouble riseTime = object.timeOfDayRising().timeAtCycle(level.getDayTime(), partialTick);
        OptionalDouble setTime = object.timeOfDaySetting().timeAtCycle(level.getDayTime(), partialTick);
        if (riseTime.isEmpty() || setTime.isEmpty()) {
            double ticksPerDay = object.timeOfDayRising().ticksPerDay();
            return new SkyPosition((float) (timeOfDayTicks(level, partialTick, ticksPerDay) / ticksPerDay * 360.0));
        }

        double ticksPerDay = object.timeOfDayRising().ticksPerDay();
        double currentTime = timeOfDayTicks(level, partialTick, ticksPerDay);
        double rise = riseTime.getAsDouble();
        double duration = wrap(setTime.getAsDouble() - rise, ticksPerDay);
        double elapsed = wrap(currentTime - rise, ticksPerDay);
        if (duration == 0.0 || elapsed > duration) {
            return null;
        }

        float progress = (float) (elapsed / duration);
        return new SkyPosition(-90.0F + 180.0F * progress);
    }

    private static double timeOfDayTicks(ClientLevel level, float partialTick, double ticksPerDay) {
        double dayTime = level.getDayTime() + level.getDayTimeFraction()
                + partialTick * level.getDayTimePerTick();
        double timeOfDay = dayTime / Level.TICKS_PER_DAY - 0.25;
        timeOfDay -= Math.floor(timeOfDay);
        return timeOfDay * ticksPerDay;
    }

    private static double wrap(double value, double modulus) {
        return value - Math.floor(value / modulus) * modulus;
    }

    private record SkyPosition(float angle) {
    }

    @Override
    public Vec3 getBrightnessDependentFogColor(Vec3 biomeFogColor, float daylight) {
        float redGreenScale = daylight * 0.94F + 0.06F;
        float blueScale = daylight * 0.91F + 0.09F;
        return biomeFogColor.multiply(redGreenScale, redGreenScale, blueScale);
    }

    @Override
    public boolean isFoggyAt(int x, int z) {
        return false;
    }
}
