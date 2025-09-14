package net.js.jsmenu.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class SuperRadioactiveBlock extends Block {
    public SuperRadioactiveBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Entity entity) {
        if (!level.isClientSide && entity instanceof Player player) {
            player.hurt(level.damageSources().generic(), 12F);
        }
        super.stepOn(level, pos, state, entity);
    }

    @Override
    protected void entityInside(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Entity entity) {
        if (!level.isClientSide && entity instanceof Player player) {
            player.hurt(level.damageSources().generic(), 12F);
        }
        super.entityInside(state, level, pos, entity);
    }

    @Override
    public void playerDestroy(Level level, @NotNull Player player, @NotNull BlockPos pos, @NotNull BlockState state,
                              BlockEntity blockEntity, @NotNull ItemStack tool) {
        if (!level.isClientSide) {
            player.hurt(level.damageSources().generic(), 6F);
        }
        super.playerDestroy(level, player, pos, state, blockEntity, tool);
    }

    @Override
    protected @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    }
}