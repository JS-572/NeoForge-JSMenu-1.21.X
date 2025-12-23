package net.js.jsmenu.util;

import net.js.jsmenu.JSMenu;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_HELIUM_TOOL = createTag("needs_helium_tool");
        public static final TagKey<Block> INCORRECT_FOR_HELIUM_TOOL = createTag("incorrect_for_helium_tool");
        public static final TagKey<Block> NEEDS_SCANDIUM_TOOL = createTag("needs_scandium_tool");
        public static final TagKey<Block> INCORRECT_FOR_SCANDIUM_TOOL = createTag("incorrect_for_scandium_tool");

        public static final TagKey<Block> TRANSITION_METAL_ORES = createTag("transition_metal_ores");
        public static final TagKey<Block> SHOVEL_MINEABLES = createTag("shovel_mineables");
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(JSMenu.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(JSMenu.MOD_ID, name));
        }
    }
}
