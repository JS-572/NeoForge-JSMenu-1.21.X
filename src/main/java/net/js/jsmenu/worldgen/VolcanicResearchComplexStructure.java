package net.js.jsmenu.worldgen;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;

import java.util.Optional;

public final class VolcanicResearchComplexStructure extends Structure {
    public static final MapCodec<VolcanicResearchComplexStructure> CODEC = Structure.simpleCodec(VolcanicResearchComplexStructure::new);

    public VolcanicResearchComplexStructure(StructureSettings settings) {
        super(settings);
    }

    @Override
    protected Optional<GenerationStub> findGenerationPoint(GenerationContext context) {
        ChunkPos chunk = context.chunkPos();
        int centerX = chunk.getMiddleBlockX();
        int centerZ = chunk.getMiddleBlockZ();
        int groundY = context.chunkGenerator().getFirstOccupiedHeight(
                centerX, centerZ, Heightmap.Types.WORLD_SURFACE_WG, context.heightAccessor(), context.randomState());
        int minY = groundY - 40;
        int maxY = groundY + 66;
        if (minY < context.heightAccessor().getMinBuildHeight()
                || maxY >= context.heightAccessor().getMaxBuildHeight()) {
            return Optional.empty();
        }

        BlockPos center = new BlockPos(centerX, groundY, centerZ);
        BoundingBox bounds = new BoundingBox(
                centerX - 52, minY, centerZ - 52,
                centerX + 52, maxY, centerZ + 52);
        return Optional.of(new GenerationStub(center, (StructurePiecesBuilder pieces) ->
                pieces.addPiece(new VolcanicResearchComplexPiece(bounds, groundY, centerX, centerZ))));
    }

    @Override
    public StructureType<?> type() {
        return ModStructures.VOLCANIC_RESEARCH_COMPLEX.get();
    }
}
