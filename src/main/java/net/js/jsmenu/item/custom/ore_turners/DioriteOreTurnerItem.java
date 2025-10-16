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

public class DioriteOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> DIORITE_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.YTTRIUM_ORE, ModBlocks.YTTRIUM_BLOCK,
                    ModBlocks.ZIRCONIUM_ORE, ModBlocks.ZIRCONIUM_BLOCK,
                    ModBlocks.NIOBIUM_ORE, ModBlocks.NIOBIUM_BLOCK,
                    ModBlocks.MOLYBDENUM_ORE, ModBlocks.MOLYBDENUM_BLOCK,
                    ModBlocks.TECHNETIUM_ORE, ModBlocks.TECHNETIUM_BLOCK,
                    ModBlocks.RUTHENIUM_ORE, ModBlocks.RUTHENIUM_BLOCK,
                    ModBlocks.RHODIUM_ORE, ModBlocks.RHODIUM_BLOCK,
                    ModBlocks.PALLADIUM_ORE, ModBlocks.PALLADIUM_BLOCK,
                    ModBlocks.SILVER_ORE, ModBlocks.SILVER_BLOCK,
                    ModBlocks.CADMIUM_ORE, ModBlocks.CADMIUM_BLOCK
            );
    public DioriteOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(DIORITE_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), DIORITE_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
