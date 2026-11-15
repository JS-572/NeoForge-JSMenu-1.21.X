package net.js.jsmenu.worldgen;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;

public final class VolcanicResearchComplexPiece extends StructurePiece {
    private final int groundY;
    private final int centerX;
    private final int centerZ;

    public VolcanicResearchComplexPiece(BoundingBox boundingBox, int groundY, int centerX, int centerZ) {
        super(ModStructures.VOLCANIC_RESEARCH_COMPLEX_PIECE.get(), 0, boundingBox);
        this.groundY = groundY;
        this.centerX = centerX;
        this.centerZ = centerZ;
    }

    public VolcanicResearchComplexPiece(CompoundTag tag) {
        super(ModStructures.VOLCANIC_RESEARCH_COMPLEX_PIECE.get(), tag);
        this.groundY = tag.getInt("GroundY");
        this.centerX = tag.getInt("CenterX");
        this.centerZ = tag.getInt("CenterZ");
    }

    @Override
    protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tag) {
        tag.putInt("GroundY", this.groundY);
        tag.putInt("CenterX", this.centerX);
        tag.putInt("CenterZ", this.centerZ);
    }

    @Override
    public void postProcess(
            WorldGenLevel level,
            StructureManager structureManager,
            ChunkGenerator chunkGenerator,
            RandomSource random,
            BoundingBox chunkBounds,
            ChunkPos chunkPos,
            BlockPos reference
    ) {
        VolcanicResearchComplexGenerator.generate(
                level,
                new BlockPos(this.centerX, this.groundY, this.centerZ),
                random,
                chunkBounds);
    }
}
