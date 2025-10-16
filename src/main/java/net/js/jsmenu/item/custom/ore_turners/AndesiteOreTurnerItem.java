package net.js.jsmenu.item.custom.ore_turners;

import net.js.jsmenu.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Map;

public class AndesiteOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> ANDESITE_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.HAFNIUM_ORE, ModBlocks.HAFNIUM_BLOCK,
                    ModBlocks.TANTALUM_ORE, ModBlocks.TANTALUM_BLOCK,
                    ModBlocks.TUNGSTEN_ORE, ModBlocks.TUNGSTEN_BLOCK,
                    ModBlocks.RHENIUM_ORE, ModBlocks.RHENIUM_BLOCK,
                    ModBlocks.OSMIUM_ORE, ModBlocks.OSMIUM_BLOCK,
                    ModBlocks.IRIDIUM_ORE, ModBlocks.IRIDIUM_BLOCK,
                    ModBlocks.PLATINUM_ORE, ModBlocks.PLATINUM_BLOCK
            );
    public AndesiteOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(ANDESITE_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), ANDESITE_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
