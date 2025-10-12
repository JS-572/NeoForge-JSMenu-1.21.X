package net.js.jsmenu.item.custom;

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

public class AlkaliOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> ALKALI_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.LITHIUM_ORE, ModBlocks.LITHIUM_BLOCK,
                    ModBlocks.SODIUM_ORE, ModBlocks.SODIUM_BLOCK,
                    ModBlocks.POTASSIUM_ORE, ModBlocks.POTASSIUM_BLOCK,
                    ModBlocks.RUBIDIUM_ORE, ModBlocks.RUBIDIUM_BLOCK,
                    ModBlocks.CAESIUM_ORE, ModBlocks.CAESIUM_BLOCK,
                    ModBlocks.FRANCIUM_ORE, ModBlocks.FRANCIUM_BLOCK
            );
    public AlkaliOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(ALKALI_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), ALKALI_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
