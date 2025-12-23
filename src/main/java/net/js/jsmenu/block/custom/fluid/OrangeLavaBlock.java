package net.js.jsmenu.block.custom.fluid;

import net.js.jsmenu.fluid.ModFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class OrangeLavaBlock extends LiquidBlock {
    public OrangeLavaBlock() {
        super(ModFluids.ORANGE_LAVA.get(), Properties.of().mapColor(MapColor.FIRE).strength(1000000000000000000000000000f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.dimension().location().toString().equals("jsmenu:space")) {
            super.randomTick(state, level, pos, random);
        }
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (level.dimension().location().toString().equals("jsmenu:space")) {
            level.setBlock(pos, state, 3);
        } else {
            super.onPlace(state, level, pos, oldState, isMoving);
        }
    }
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.dimension().location().toString().equals("jsmenu:space")) {
            level.setBlock(pos, state, 3); // prevent flow
        } else {
            super.neighborChanged(state, level, pos, block, fromPos, isMoving);
        }
    }
}
