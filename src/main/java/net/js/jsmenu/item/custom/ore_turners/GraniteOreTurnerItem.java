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

public class GraniteOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> GRANITE_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.SCANDIUM_ORE, ModBlocks.SCANDIUM_BLOCK,
                    ModBlocks.TITANIUM_ORE, ModBlocks.TITANIUM_BLOCK,
                    ModBlocks.VANADIUM_ORE, ModBlocks.VANADIUM_BLOCK,
                    ModBlocks.CHROMIUM_ORE, ModBlocks.CHROMIUM_BLOCK,
                    ModBlocks.MANGANESE_ORE, ModBlocks.MANGANESE_BLOCK,
                    ModBlocks.COBALT_ORE, ModBlocks.COBALT_BLOCK,
                    ModBlocks.NICKEL_ORE, ModBlocks.NICKEL_BLOCK,
                    ModBlocks.ZINC_ORE, ModBlocks.ZINC_BLOCK
            );
    public GraniteOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(GRANITE_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), GRANITE_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
