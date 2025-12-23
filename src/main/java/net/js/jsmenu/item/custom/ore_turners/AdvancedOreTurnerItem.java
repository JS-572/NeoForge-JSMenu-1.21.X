package net.js.jsmenu.item.custom.ore_turners;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;
import java.util.function.Consumer;

public class AdvancedOreTurnerItem extends Item {

    // Overworld Stone ores
    private static final List<Block> STONE_ORES = List.of(
            Blocks.COAL_ORE, Blocks.IRON_ORE, Blocks.COPPER_ORE,
            Blocks.GOLD_ORE, Blocks.REDSTONE_ORE, Blocks.LAPIS_ORE,
            Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE
    );

    // Deepslate ores
    private static final List<Block> DEEPSLATE_ORES = List.of(
            Blocks.DEEPSLATE_COAL_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.DEEPSLATE_COPPER_ORE,
            Blocks.DEEPSLATE_GOLD_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.DEEPSLATE_LAPIS_ORE,
            Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DEEPSLATE_EMERALD_ORE
    );

    // Nether ores
    private static final List<Block> NETHER_ORES = List.of(
            Blocks.NETHER_GOLD_ORE, Blocks.ANCIENT_DEBRIS, Blocks.NETHER_QUARTZ_ORE
    );

    public AdvancedOreTurnerItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        if (level.isClientSide()) return InteractionResult.SUCCESS;

        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();
        net.minecraft.util.RandomSource random = level.getRandom();
        Block newBlock = null;

        if (clickedBlock == Blocks.STONE) {
            newBlock = STONE_ORES.get(random.nextInt(STONE_ORES.size()));
        } else if (clickedBlock == Blocks.DEEPSLATE) {
            newBlock = DEEPSLATE_ORES.get(random.nextInt(DEEPSLATE_ORES.size()));
        }
        else if (clickedBlock == Blocks.NETHERRACK) {
            newBlock = NETHER_ORES.get(random.nextInt(NETHER_ORES.size()));
        }

        if (newBlock != null) {
            level.setBlockAndUpdate(context.getClickedPos(), newBlock.defaultBlockState());
            EquipmentSlot slot = context.getHand() == InteractionHand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND;
            context.getItemInHand().hurtAndBreak(0, context.getPlayer(), slot);

        }

        return InteractionResult.SUCCESS;
    }
}
