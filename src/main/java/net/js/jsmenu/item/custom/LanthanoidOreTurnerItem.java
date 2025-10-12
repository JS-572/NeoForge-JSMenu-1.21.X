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

public class LanthanoidOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> LANTHANOID_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.LANTHANUM_ORE, ModBlocks.LANTHANUM_BLOCK,
                    ModBlocks.CERIUM_ORE, ModBlocks.CERIUM_BLOCK,
                    ModBlocks.PRASEODYMIUM_ORE, ModBlocks.PRASEODYMIUM_BLOCK,
                    ModBlocks.NEODYMIUM_ORE, ModBlocks.NEODYMIUM_BLOCK,
                    ModBlocks.PROMETHIUM_ORE, ModBlocks.PROMETHIUM_BLOCK,
                    ModBlocks.SAMARIUM_ORE, ModBlocks.SAMARIUM_BLOCK,
                    ModBlocks.EUROPIUM_ORE, ModBlocks.EUROPIUM_BLOCK,
                    ModBlocks.GADOLINIUM_ORE, ModBlocks.GADOLINIUM_BLOCK,
                    ModBlocks.TERBIUM_ORE, ModBlocks.TERBIUM_BLOCK,
                    ModBlocks.DYSPROSIUM_ORE, ModBlocks.DYSPROSIUM_BLOCK
            );
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> LANTHANOID_ORE_TURNER_MAP_2 =
            Map.of(
                    ModBlocks.HOLMIUM_ORE, ModBlocks.HOLMIUM_BLOCK,
                    ModBlocks.ERBIUM_ORE, ModBlocks.ERBIUM_BLOCK,
                    ModBlocks.THULIUM_ORE, ModBlocks.THULIUM_BLOCK,
                    ModBlocks.YTTERBIUM_ORE, ModBlocks.YTTERBIUM_BLOCK,
                    ModBlocks.LUTETIUM_ORE, ModBlocks.LUTETIUM_BLOCK
            );
    public LanthanoidOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(LANTHANOID_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), LANTHANOID_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }
        if(LANTHANOID_ORE_TURNER_MAP_2.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), LANTHANOID_ORE_TURNER_MAP_2.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }

}
