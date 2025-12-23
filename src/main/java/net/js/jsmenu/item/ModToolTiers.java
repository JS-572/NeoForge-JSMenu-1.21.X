package net.js.jsmenu.item;

import net.js.jsmenu.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier HELIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_HELIUM_TOOL, 1200, 6f, 18f, 16, () -> Ingredient.of(ModItems.HELIUM));
    public static final Tier SCANDIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SCANDIUM_TOOL, 800, 2.5f, 14f, 20, () -> Ingredient.of(ModItems.SCANDIUM_INGOT));
}
