package net.js.jsmenu.item.custom.ore_turners;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import java.util.Map;

public class OreTurnerItem extends Item {
    private static final Map<Block, Block> ORE_TURNER_MAP =
            Map.of(
                    Blocks.COAL_ORE, Blocks.COAL_BLOCK,
                    Blocks.COPPER_ORE, Blocks.COPPER_BLOCK,
                    Blocks.IRON_ORE, Blocks.IRON_BLOCK,
                    Blocks.GOLD_ORE, Blocks.GOLD_BLOCK,
                    Blocks.LAPIS_ORE, Blocks.LAPIS_BLOCK,
                    Blocks.REDSTONE_ORE, Blocks.REDSTONE_BLOCK,
                    Blocks.EMERALD_ORE, Blocks.EMERALD_BLOCK,
                    Blocks.DIAMOND_ORE, Blocks.DIAMOND_BLOCK
            );
    public OreTurnerItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(ORE_TURNER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), ORE_TURNER_MAP.get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(0, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.GLASS_BREAK, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
