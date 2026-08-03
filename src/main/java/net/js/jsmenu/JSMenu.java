package net.js.jsmenu;

import net.js.jsmenu.block.ModBlocks;
import net.js.jsmenu.block.StarBlocks;
import net.js.jsmenu.fluid.types.ModFluidTypes;
import net.js.jsmenu.item.ModCreativeModeTabs;
import net.js.jsmenu.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OFEPETALS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOUNTAIN_DAISY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRING_MORNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TIGER_BELL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STARBURST.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAIN_DROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEW_CRYSTAL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EMPEROR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNOW_LILY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MEADOW_LILY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLDEN_RAYS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LANTERN_BOWL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUNSET_TULIP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.IRIS_MANTLE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CALA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RAINBOW_STARS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FIRE_LILY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ROYAL_ROSE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WILD_ROSE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PARADISE_FLOWER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUGARPLUM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPARKLE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EVENSONG.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARM_WELCOME.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEDDING_BELL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BUNNY_EARS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUNSET_DAISY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.XMAS_THISTLE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LADYS_GOWN.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FROST_BERRY.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRING_BUTTERCUP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LADYS_BUTTON.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HEART_BOWL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_GRACE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOTHERS_ROSE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.INNER_PEACE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WISHING_TULIP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_BELL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DREAM_STARS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ARADIA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SEMPITERNAL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.NOON_DREAM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRAIRIE_HEART.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.AURORA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRIENDSHIP_ROSE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.XANAS_CHARM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LOVE_EVERLASTING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.REMEMBRANCE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICY_DROP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTER_SOLACE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.POINSETTIA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EDELWEISS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAVENDER_STAR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_LYS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUEENS_GUARD.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WINTERS_END.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEW_YEARS_WISH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SKYS_EDGE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FOYS_TREASURE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SNAPPY_FLOWER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAY_FLOWER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUMMER_FINGERS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.P_GAMERALUM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_TENDRILS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOON_CRAVER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.APPERA_BLOSSOM.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TULIP_GAMEORA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRING_TOUCH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ALL_HALLOWS_EVE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOWGRASS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_LOG.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRIPPED_TERMINUS_SPLIT_LOG.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_WOOD.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRIPPED_TERMINUS_SPLIT_WOOD.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_PLANKS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.FLAREWOOD_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.FLAREWOOD_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.FLAREWOOD_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.FLAREWOOD_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.CORONA_BLOOM_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.CORONA_BLOOM_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.CORONA_BLOOM_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(StarBlocks.CORONA_BLOOM_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUNAR_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOM_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRIFT_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VACUUM_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUNAR_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUNAR_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LUNAR_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOM_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOM_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLOOM_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRIFT_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRIFT_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRIFT_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VACUUM_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VACUUM_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VACUUM_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HELIOSPIRE_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HELIOSPIRE_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HELIOSPIRE_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HELIOSPIRE_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.UMBRA_ROOT_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.UMBRA_ROOT_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.UMBRA_ROOT_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.UMBRA_ROOT_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TERMINUS_SPLIT_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FERRIC_SPINE_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FERRIC_SPINE_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FERRIC_SPINE_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FERRIC_SPINE_TRAPDOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRYOSTEM_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRYOSTEM_SAPLING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRYOSTEM_DOOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRYOSTEM_TRAPDOOR.get(), RenderType.cutout());
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
