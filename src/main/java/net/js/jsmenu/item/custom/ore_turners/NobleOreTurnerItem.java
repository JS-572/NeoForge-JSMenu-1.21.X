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

public class NobleOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> NOBLE_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.NEON_ORE, ModBlocks.NEON_BLOCK,
                    ModBlocks.ARGON_ORE, ModBlocks.ARGON_BLOCK,
                    ModBlocks.KRYPTON_ORE, ModBlocks.KRYPTON_BLOCK,
                    ModBlocks.XENON_ORE, ModBlocks.XENON_BLOCK,
                    ModBlocks.RADON_ORE, ModBlocks.RADON_BLOCK,
                    ModBlocks.OGANESSON_ORE, ModBlocks.OGANESSON_BLOCK
            );
    public NobleOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(NOBLE_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), NOBLE_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
