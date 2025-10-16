package net.js.jsmenu.fluid.types;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class BromineFluidType extends FluidType {
    public BromineFluidType() {
        super(FluidType.Properties.create().fallDistanceModifier(0f).canExtinguish(false).supportsBoating(false).canHydrate(false).motionScale(0.0028D).canConvertToSource(true).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
    }
    @SubscribeEvent
    public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("jsmenu:block/bromine");
            private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("jsmenu:block/bromine_flowing");

            @Override
            public ResourceLocation getStillTexture () {
                return STILL_TEXTURE;
            }

            @Override
            public ResourceLocation getFlowingTexture () {
                return FLOWING_TEXTURE;
            }
        }, ModFluidTypes.BROMINE_TYPE.get());
    }
}
