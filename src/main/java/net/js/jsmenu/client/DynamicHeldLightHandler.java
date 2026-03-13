package net.js.jsmenu.client;

import net.js.jsmenu.item.ModItems;
import net.minecraft.world.item.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;

public class DynamicHeldLightHandler {

    private BlockPos lastLightPos = null;

    public static void register() {
        NeoForge.EVENT_BUS.register(new DynamicHeldLightHandler());
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.level == null) return;

        boolean holdingLight =
                mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_PICKAXE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_SWORD.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_SHOVEL.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_AXE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_HOE.get()) ||

                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(ModItems.SCANDIUM_SWORD.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(ModItems.SCANDIUM_PICKAXE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(ModItems.SCANDIUM_SHOVEL.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(ModItems.SCANDIUM_AXE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(ModItems.SCANDIUM_HOE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(Items.TORCH) ||
                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(Items.TORCH) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(Items.REDSTONE_TORCH) ||
                        mc.player.getItemBySlot(EquipmentSlot.OFFHAND).is(Items.REDSTONE_TORCH);

        BlockPos pos = mc.player.blockPosition();

        if (holdingLight) {

            if (!pos.equals(lastLightPos)) {

                if (lastLightPos != null) {
                    mc.level.setBlock(lastLightPos, Blocks.AIR.defaultBlockState(), 3);
                }

                mc.level.setBlock(pos, Blocks.LIGHT.defaultBlockState(), 3);

                lastLightPos = pos;
            }

        } else if (lastLightPos != null) {

            mc.level.setBlock(lastLightPos, Blocks.AIR.defaultBlockState(), 3);
            lastLightPos = null;

        }
    }
}
