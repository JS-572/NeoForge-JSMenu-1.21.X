package net.js.jsmenu.client;

import net.js.jsmenu.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.common.NeoForge;

public class DynamicHeldLightHandler {

    private static final int LIGHT_LEVEL = 15;

    public static void register() {
        NeoForge.EVENT_BUS.register(new DynamicHeldLightHandler());
    }

    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;

        boolean holdingLight =
                mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_PICKAXE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_SWORD.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_SHOVEL.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_AXE.get()) ||
                        mc.player.getItemBySlot(EquipmentSlot.MAINHAND).is(ModItems.SCANDIUM_HOE.get());

        // vanilla lighting handled elsewhere (block placement)
    }
}

