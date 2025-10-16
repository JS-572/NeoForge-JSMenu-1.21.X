package net.js.jsmenu.fluid.types;

import net.js.jsmenu.JSMenu;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, JSMenu.MOD_ID);
    public static final DeferredHolder<FluidType, FluidType> BROMINE_TYPE = REGISTRY.register("bromine", () -> new BromineFluidType());
    public static final DeferredHolder<FluidType, FluidType> MERCURY_TYPE = REGISTRY.register("mercury", () -> new MercuryFluidType());
}
