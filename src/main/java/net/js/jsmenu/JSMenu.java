package net.js.jsmenu;

import net.js.jsmenu.block.ModBlocks;
import net.js.jsmenu.block.StarBlocks;
import net.js.jsmenu.fluid.types.ModFluidTypes;
import net.js.jsmenu.item.ModCreativeModeTabs;
import net.js.jsmenu.item.ModItems;
import net.js.jsmenu.network.payload.HarvestLavaPayload;
import net.js.jsmenu.network.payload.RequestLandingPayload;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.js.jsmenu.fluid.ModFluids;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(JSMenu.MOD_ID)
public class JSMenu {
    public static final String MOD_ID = "jsmenu";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public JSMenu(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        StarBlocks.register(modEventBus);

        ModFluids.REGISTRY.register(modEventBus);
        ModFluidTypes.REGISTRY.register(modEventBus);
        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        if (FMLEnvironment.dist.isClient()) {
            JSMenuClient.init(modEventBus);
        }
    }
    private void registerNetworkPackets(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar("1.0");
        registrar.playToServer(
                HarvestLavaPayload.TYPE,
                HarvestLavaPayload.STREAM_CODEC,
                this::handleHarvestLavaPacket
        );

        registrar.playToServer(
                RequestLandingPayload.TYPE,
                RequestLandingPayload.STREAM_CODEC,
                this::handleRequestLandingPacket
        );
    }
    private void handleHarvestLavaPacket(final HarvestLavaPayload payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            Player player = context.player();
        });
    }
    private void handleRequestLandingPacket(final RequestLandingPayload payload, final IPayloadContext context) {
        context.enqueueWork(() -> {
            Player player = context.player();
        });
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            event.insertAfter(
                    new ItemStack(Items.YELLOW_CONCRETE),
                    new ItemStack(ModBlocks.LIGHT_YELLOW_CONCRETE.get()),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
