package net.js.jsmenu;

import net.js.jsmenu.client.HeldLightSphereHandler;
import net.neoforged.bus.api.IEventBus;

/**
 * Client-side registration helper. Call JSMenuClient.init(modBus) from your main mod constructor
 * passing the IEventBus you receive there.
 */
public class JSMenuClient {
    public static void init(IEventBus modBus) {
        HeldLightSphereHandler.register();
    }
}
