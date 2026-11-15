package net.js.jsmenu.item.custom;

import net.js.jsmenu.block.ModBlocks;
import net.js.jsmenu.block.custom.SportsBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Map;

import static java.util.Map.entry;

public class ScoreboardUpdaterItem extends Item {

    public static final Map<Block, Block> SCOREBOARD_BLOCKS_MAP = Map.ofEntries(
            entry(ModBlocks.ZERO.get(), ModBlocks.ONE.get()),
            entry(ModBlocks.ONE.get(), ModBlocks.TWO.get()),
            entry(ModBlocks.TWO.get(), ModBlocks.THREE.get()),
            entry(ModBlocks.THREE.get(), ModBlocks.FOUR.get()),
            entry(ModBlocks.FOUR.get(), ModBlocks.FIVE.get()),
            entry(ModBlocks.FIVE.get(), ModBlocks.SIX.get()),
            entry(ModBlocks.SIX.get(), ModBlocks.SEVEN.get()),
            entry(ModBlocks.SEVEN.get(), ModBlocks.EIGHT.get()),
            entry(ModBlocks.EIGHT.get(), ModBlocks.NINE.get()),
            entry(ModBlocks.NINE.get(), ModBlocks.ZERO.get()),
            entry(ModBlocks.UNLOADED_BASE.get(), ModBlocks.LOADED_BASE.get()),
            entry(ModBlocks.LOADED_BASE.get(), ModBlocks.UNLOADED_BASE.get())
    );

    public ScoreboardUpdaterItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        if (level.isClientSide()) return InteractionResult.SUCCESS;

        BlockPos pos = context.getClickedPos();
        BlockState oldState = level.getBlockState(pos);
        Block newBlock = SCOREBOARD_BLOCKS_MAP.get(oldState.getBlock());

        if (newBlock != null) {
            BlockState newState = newBlock.defaultBlockState()
                    .setValue(SportsBlock.FACING, oldState.getValue(SportsBlock.FACING));
            level.setBlockAndUpdate(pos, newState);

            context.getItemInHand().hurtAndBreak(0, (ServerLevel) level, context.getPlayer(),
                    item -> context.getPlayer().onEquippedItemBroken(item,
                            context.getHand() == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND));

            return InteractionResult.CONSUME;
        }

        return InteractionResult.PASS;
    }
}
