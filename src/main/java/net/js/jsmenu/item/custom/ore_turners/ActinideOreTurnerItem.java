package net.js.jsmenu.item.custom.ore_turners;

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

public class ActinideOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> ACTINIDE_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.ACTINIUM_ORE, ModBlocks.ACTINIUM_BLOCK,
                    ModBlocks.THORIUM_ORE, ModBlocks.THORIUM_BLOCK,
                    ModBlocks.PROTACTINIUM_ORE, ModBlocks.PROTACTINIUM_BLOCK,
                    ModBlocks.URANIUM_ORE, ModBlocks.URANIUM_BLOCK,
                    ModBlocks.NEPTUNIUM_ORE, ModBlocks.NEPTUNIUM_BLOCK,
                    ModBlocks.PLUTONIUM_ORE, ModBlocks.PLUTONIUM_BLOCK,
                    ModBlocks.AMERICIUM_ORE, ModBlocks.AMERICIUM_BLOCK,
                    ModBlocks.CURIUM_ORE, ModBlocks.CURIUM_BLOCK,
                    ModBlocks.BERKELIUM_ORE, ModBlocks.BERKELIUM_BLOCK,
                    ModBlocks.CALIFORNIUM_ORE, ModBlocks.CALIFORNIUM_BLOCK
            );
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> ACTINIDE_ORE_TURNER_MAP_2 =
            Map.of(
                    ModBlocks.EINSTEINIUM_ORE, ModBlocks.EINSTEINIUM_BLOCK,
                    ModBlocks.FERMIUM_ORE, ModBlocks.FERMIUM_BLOCK,
                    ModBlocks.MENDELEVIUM_ORE, ModBlocks.MENDELEVIUM_BLOCK,
                    ModBlocks.NOBELIUM_ORE, ModBlocks.NOBELIUM_BLOCK,
                    ModBlocks.LAWRENCIUM_ORE, ModBlocks.LAWRENCIUM_BLOCK
            );
    public ActinideOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(ACTINIDE_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), ACTINIDE_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }
        if(ACTINIDE_ORE_TURNER_MAP_2.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), ACTINIDE_ORE_TURNER_MAP_2.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.SCULK_SHRIEKER_SHRIEK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
    
}
