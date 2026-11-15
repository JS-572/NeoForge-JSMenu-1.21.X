package net.js.jsmenu.block.custom.saplings.planet.Mars;

import com.mojang.serialization.MapCodec;
import net.js.jsmenu.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DustwillowSaplingBlock extends BushBlock implements BonemealableBlock {
    public static final MapCodec<DustwillowSaplingBlock> CODEC = simpleCodec(DustwillowSaplingBlock::new);

    public DustwillowSaplingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<DustwillowSaplingBlock> codec() {
        return CODEC;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(ModBlocks.REDGRASS_BLOCK.get())
                || state.is(ModBlocks.RUSTSOIL.get())
                || state.is(Blocks.PACKED_ICE)
                || state.is(ModBlocks.SCORCHED_ROCK.get());
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        growTree(level, pos);
    }

    private void growTree(ServerLevel level, BlockPos pos) {
        level.removeBlock(pos, false);

        // Simple example tree:
        for (int i = 0; i < 7; i++) {
            level.setBlock(pos.above(i), ModBlocks.DUSTWILLOW_LOG.get().defaultBlockState(), 3);
        }

        // Leaves (basic cube)
        BlockPos top = pos.above(8);

        for (int x = -6; x <= 6; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -6; z <= 6; z++) {
                    if (Math.abs(x) + Math.abs(y) + Math.abs(z) < 4) {
                        level.setBlock(top.offset(x, y, z),
                                ModBlocks.DUSTWILLOW_LEAVES.get().defaultBlockState(), 3);
                    }
                }
            }
        }
    }
}
