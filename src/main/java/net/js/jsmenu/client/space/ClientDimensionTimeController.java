package net.js.jsmenu.client.space;

import net.js.jsmenu.server.DimensionTimeController;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.LevelTickEvent;

@EventBusSubscriber(modid = "jsmenu", value = Dist.CLIENT, bus = EventBusSubscriber.Bus.GAME)
public final class ClientDimensionTimeController {
    private ClientDimensionTimeController() {
    }

    @SubscribeEvent
    public static void onLevelTick(LevelTickEvent.Post event) {
        if (!(event.getLevel() instanceof ClientLevel level)) return;
        if (level.dimension().equals(Level.OVERWORLD)) return;

        double dayLength = DimensionTimeController.dayLengthFor(level.dimension());
        if (dayLength <= 0.0) return;

        level.setDayTimePerTick((float) (24000.0 / dayLength));
    }
}
