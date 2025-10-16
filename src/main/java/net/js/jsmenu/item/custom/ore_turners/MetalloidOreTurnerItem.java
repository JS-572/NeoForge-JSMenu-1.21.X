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

public class MetalloidOreTurnerItem extends Item {
    private static final Map<DeferredBlock<Block>, DeferredBlock<Block>> METALLOID_ORE_TURNER_MAP =
            Map.of(
                    ModBlocks.BORON_ORE, ModBlocks.BORON_BLOCK,
                    ModBlocks.SILICON_ORE, ModBlocks.SILICON_BLOCK,
                    ModBlocks.GERMANIUM_ORE, ModBlocks.GERMANIUM_BLOCK,
                    ModBlocks.ARSENIC_ORE, ModBlocks.ARSENIC_BLOCK,
                    ModBlocks.ANTIMONY_ORE, ModBlocks.ANTIMONY_BLOCK,
                    ModBlocks.TELLURIUM_ORE, ModBlocks.TELLURIUM_BLOCK,
                    ModBlocks.POLONIUM_ORE, ModBlocks.POLONIUM_BLOCK
            );
    public MetalloidOreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(METALLOID_ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), METALLOID_ORE_TURNER_MAP.get(clickedBlock).get().defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
