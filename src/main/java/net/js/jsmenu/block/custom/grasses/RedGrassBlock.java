package net.js.jsmenu.block.custom.grasses;

import com.mojang.serialization.MapCodec;
import net.js.jsmenu.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.Optional;

public class RedGrassBlock extends SpreadingSnowyDirtBlock implements BonemealableBlock {
    public static final MapCodec<RedGrassBlock> CODEC = simpleCodec();

    public static MapCodec<RedGrassBlock> simpleCodec() {
        return Block.simpleCodec(properties -> new RedGrassBlock(properties, ModBlocks.RUSTSOIL.get()));
    }

    private final Block spreadTarget;

    public RedGrassBlock(Properties properties, Block spreadTarget) {
        super(properties);
        this.spreadTarget = spreadTarget;
    }

    @Override
    protected MapCodec<RedGrassBlock> codec() {
        return CODEC;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockPos spreadPos = pos.offset(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
        if (!level.isLoaded(spreadPos) || spreadPos.equals(pos)) {
            return;
        }

        if (level.getBlockState(spreadPos).is(spreadTarget) && level.isEmptyBlock(spreadPos.above()) && random.nextInt(6) == 0) {
            level.setBlockAndUpdate(spreadPos, defaultBlockState());
        }
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
    public void performBonemeal(ServerLevel serverLevel, RandomSource randomSource, BlockPos blockPos, BlockState blockState) {
        BlockPos blockpos = blockPos.above();
        BlockState blockstate = Blocks.SHORT_GRASS.defaultBlockState();
        Optional<Holder.Reference<PlacedFeature>> optional = serverLevel.registryAccess()
                .registryOrThrow(Registries.PLACED_FEATURE)
                .getHolder(VegetationPlacements.GRASS_BONEMEAL);

        label49:
        for (int i = 0; i < 128; i++) {
            BlockPos blockpos1 = blockpos;

            for (int j = 0; j < i / 16; j++) {
                blockpos1 = blockpos1.offset(randomSource.nextInt(3) - 1, (randomSource.nextInt(3) - 1) * randomSource.nextInt(3) / 2, randomSource.nextInt(3) - 1);
                if (!serverLevel.getBlockState(blockpos1.below()).is(this) || serverLevel.getBlockState(blockpos1).isCollisionShapeFullBlock(serverLevel, blockpos1)) {
                    continue label49;
                }
            }

            BlockState blockstate1 = serverLevel.getBlockState(blockpos1);
            if (blockstate1.is(blockstate.getBlock()) && randomSource.nextInt(10) == 0) {
                ((BonemealableBlock)blockstate.getBlock()).performBonemeal(serverLevel, randomSource, blockpos1, blockstate1);
            }

            if (blockstate1.isAir()) {
                Holder<PlacedFeature> holder;
                if (randomSource.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list = serverLevel.getBiome(blockpos1).value().getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    holder = ((RandomPatchConfiguration)list.get(0).config()).feature();
                } else {
                    if (!optional.isPresent()) {
                        continue;
                    }

                    holder = optional.get();
                }

                holder.value().place(serverLevel, serverLevel.getChunkSource().getGenerator(), randomSource, blockpos1);
            }
        }
    }
    @Override
    public Type getType() {
        return Type.NEIGHBOR_SPREADER;
    }
}
