package net.js.jsmenu.item.custom;

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

public class NetherOreTurnerItem extends Item {
    private static final Map<Block, Block> NETHER_ORE_TURNER_MAP =
            Map.of(
                    Blocks.NETHER_QUARTZ_ORE, Blocks.QUARTZ_BLOCK,
                    Blocks.NETHER_GOLD_ORE, Blocks.GOLD_BLOCK,
                    Blocks.ANCIENT_DEBRIS, Blocks.NETHERITE_BLOCK
            );
    public NetherOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(NETHER_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), NETHER_ORE_TURNER_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.BLAZE_SHOOT, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
