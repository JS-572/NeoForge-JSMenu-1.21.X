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

public class PostTransitionOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> POST_TRANSITION_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.ALUMINUM_ORE, ModBlocks.ALUMINUM_BLOCK,
                    ModBlocks.GALLIUM_ORE, ModBlocks.GALLIUM_BLOCK,
                    ModBlocks.INDIUM_ORE, ModBlocks.INDIUM_BLOCK,
                    ModBlocks.TIN_ORE, ModBlocks.TIN_BLOCK,
                    ModBlocks.THALLIUM_ORE, ModBlocks.THALLIUM_BLOCK,
                    ModBlocks.LEAD_ORE, ModBlocks.LEAD_BLOCK,
                    ModBlocks.BISMUTH_ORE, ModBlocks.BISMUTH_BLOCK,
                    ModBlocks.NIHONIUM_ORE, ModBlocks.NIHONIUM_BLOCK,
                    ModBlocks.FLEROVIUM_ORE, ModBlocks.FLEROVIUM_BLOCK,
                    ModBlocks.MOSCOVIUM_ORE, ModBlocks.MOSCOVIUM_BLOCK
            );
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> POST_TRANSITION_ORE_TURNER_MAP_2 =
            Map.of(
                    ModBlocks.LIVERMORIUM_ORE, ModBlocks.LIVERMORIUM_BLOCK
            );

    public PostTransitionOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(POST_TRANSITION_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), POST_TRANSITION_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }
        if(POST_TRANSITION_ORE_TURNER_MAP_2.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), POST_TRANSITION_ORE_TURNER_MAP_2.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }


        return InteractionResult.SUCCESS;
    }
}
