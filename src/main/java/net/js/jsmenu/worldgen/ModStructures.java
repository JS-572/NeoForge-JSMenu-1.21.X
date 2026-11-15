package net.js.jsmenu.worldgen;

import net.js.jsmenu.JSMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModStructures {
    public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPES =
            DeferredRegister.create(Registries.STRUCTURE_TYPE, JSMenu.MOD_ID);
    public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECES =
            DeferredRegister.create(Registries.STRUCTURE_PIECE, JSMenu.MOD_ID);

    public static final DeferredHolder<StructureType<?>, StructureType<VolcanicResearchComplexStructure>> VOLCANIC_RESEARCH_COMPLEX =
            STRUCTURE_TYPES.register("volcano_complex",
                    () -> () -> VolcanicResearchComplexStructure.CODEC);
    public static final DeferredHolder<StructurePieceType, StructurePieceType> VOLCANIC_RESEARCH_COMPLEX_PIECE =
            STRUCTURE_PIECES.register("volcano_complex",
                    () -> (StructurePieceType) (StructurePieceType.ContextlessType) VolcanicResearchComplexPiece::new);

    private ModStructures() {
    }

    public static void register(net.neoforged.bus.api.IEventBus modBus) {
        STRUCTURE_TYPES.register(modBus);
        STRUCTURE_PIECES.register(modBus);
    }

}
