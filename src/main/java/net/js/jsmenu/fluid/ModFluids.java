package net.js.jsmenu.fluid;

import net.js.jsmenu.JSMenu;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluids {
    public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, JSMenu.MOD_ID);
    public static final DeferredHolder<Fluid, FlowingFluid> BROMINE = REGISTRY.register("bromine", () -> new BromineFluid.Source());
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BROMINE = REGISTRY.register("flowing_bromine", () -> new BromineFluid.Flowing());
    public static final DeferredHolder<Fluid, FlowingFluid> MERCURY = REGISTRY.register("mercury", () -> new MercuryFluid.Source());
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_MERCURY = REGISTRY.register("flowing_mercury", () -> new MercuryFluid.Flowing());

    @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class FluidsClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(BROMINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_BROMINE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(MERCURY.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_MERCURY.get(), RenderType.translucent());
        }
    }
}
