package net.js.jsmenu.item.custom.ore_turners;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class DeepslateOreTurnerItem extends Item {
    private static final Map<Block, Block> DEEPSLATE_ORE_TURNER_MAP =
            Map.of(
                    Blocks.DEEPSLATE_COAL_ORE, Blocks.COAL_BLOCK,
                    Blocks.DEEPSLATE_COPPER_ORE, Blocks.COPPER_BLOCK,
                    Blocks.DEEPSLATE_IRON_ORE, Blocks.IRON_BLOCK,
                    Blocks.DEEPSLATE_GOLD_ORE, Blocks.GOLD_BLOCK,
                    Blocks.DEEPSLATE_LAPIS_ORE, Blocks.LAPIS_BLOCK,
                    Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.REDSTONE_BLOCK,
                    Blocks.DEEPSLATE_EMERALD_ORE, Blocks.EMERALD_BLOCK,
                    Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DIAMOND_BLOCK
            );
    public DeepslateOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(DEEPSLATE_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), DEEPSLATE_ORE_TURNER_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
