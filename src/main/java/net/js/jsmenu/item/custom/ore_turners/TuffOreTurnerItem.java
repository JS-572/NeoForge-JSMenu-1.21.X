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

public class TuffOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> TUFF_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.RUTHERFORDIUM_ORE, ModBlocks.RUTHERFORDIUM_BLOCK,
                    ModBlocks.DUBNIUM_ORE, ModBlocks.DUBNIUM_BLOCK,
                    ModBlocks.SEABORGIUM_ORE, ModBlocks.SEABORGIUM_BLOCK,
                    ModBlocks.BOHRIUM_ORE, ModBlocks.BOHRIUM_BLOCK,
                    ModBlocks.HASSIUM_ORE, ModBlocks.HASSIUM_BLOCK,
                    ModBlocks.MEITNERIUM_ORE, ModBlocks.MEITNERIUM_BLOCK,
                    ModBlocks.DARMSTADTIUM_ORE, ModBlocks.DARMSTADTIUM_BLOCK,
                    ModBlocks.ROENTGENIUM_ORE, ModBlocks.ROENTGENIUM_BLOCK,
                    ModBlocks.COPERNICIUM_ORE, ModBlocks.COPERNICIUM_BLOCK
            );
    public TuffOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(TUFF_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), TUFF_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
