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

public class NonmetalOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> NONMETAL_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.HYDROGEN_ORE, ModBlocks.HYDROGEN_BLOCK,
                    ModBlocks.CARBON_ORE, ModBlocks.CARBON_BLOCK,
                    ModBlocks.NITROGEN_ORE, ModBlocks.NITROGEN_BLOCK,
                    ModBlocks.OXYGEN_ORE, ModBlocks.OXYGEN_BLOCK,
                    ModBlocks.PHOSPHORUS_ORE, ModBlocks.PHOSPHORUS_BLOCK,
                    ModBlocks.SULFUR_ORE, ModBlocks.SULFUR_BLOCK,
                    ModBlocks.SELENIUM_ORE, ModBlocks.SELENIUM_BLOCK
            );
    public NonmetalOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(NONMETAL_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), NONMETAL_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
