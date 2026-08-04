package net.js.jsmenu.client;

import net.js.jsmenu.block.ModBlocks;
import net.js.jsmenu.block.StarBlocks;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.IClientBlockExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = "jsmenu", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModBlockRenderers {
    private ModBlockRenderers() {
    }

    @SubscribeEvent
    public static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        IClientBlockExtensions cutoutExtension = new IClientBlockExtensions() {
            public RenderType getRenderType() {
                return RenderType.cutout();
            }
        };
        event.registerBlock(cutoutExtension, ModBlocks.OFEPETALS.get());
        event.registerBlock(cutoutExtension, ModBlocks.MOUNTAIN_DAISY.get());
        event.registerBlock(cutoutExtension, ModBlocks.SPRING_MORNING.get());
        event.registerBlock(cutoutExtension, ModBlocks.TIGER_BELL.get());
        event.registerBlock(cutoutExtension, ModBlocks.STARBURST.get());
        event.registerBlock(cutoutExtension, ModBlocks.RAIN_DROP.get());
        event.registerBlock(cutoutExtension, ModBlocks.DEW_CRYSTAL.get());
        event.registerBlock(cutoutExtension, ModBlocks.EMPEROR.get());
        event.registerBlock(cutoutExtension, ModBlocks.SNOW_LILY.get());
        event.registerBlock(cutoutExtension, ModBlocks.MEADOW_LILY.get());
        event.registerBlock(cutoutExtension, ModBlocks.GOLDEN_RAYS.get());
        event.registerBlock(cutoutExtension, ModBlocks.LANTERN_BOWL.get());
        event.registerBlock(cutoutExtension, ModBlocks.SUNSET_TULIP.get());
        event.registerBlock(cutoutExtension, ModBlocks.IRIS_MANTLE.get());
        event.registerBlock(cutoutExtension, ModBlocks.CALA.get());
        event.registerBlock(cutoutExtension, ModBlocks.RAINBOW_STARS.get());
        event.registerBlock(cutoutExtension, ModBlocks.FIRE_LILY.get());
        event.registerBlock(cutoutExtension, ModBlocks.ROYAL_ROSE.get());
        event.registerBlock(cutoutExtension, ModBlocks.WILD_ROSE.get());
        event.registerBlock(cutoutExtension, ModBlocks.PARADISE_FLOWER.get());
        event.registerBlock(cutoutExtension, ModBlocks.SUGARPLUM.get());
        event.registerBlock(cutoutExtension, ModBlocks.SPARKLE.get());
        event.registerBlock(cutoutExtension, ModBlocks.EVENSONG.get());
        event.registerBlock(cutoutExtension, ModBlocks.WARM_WELCOME.get());
        event.registerBlock(cutoutExtension, ModBlocks.WEDDING_BELL.get());
        event.registerBlock(cutoutExtension, ModBlocks.BUNNY_EARS.get());
        event.registerBlock(cutoutExtension, ModBlocks.SUNSET_DAISY.get());
        event.registerBlock(cutoutExtension, ModBlocks.XMAS_THISTLE.get());
        event.registerBlock(cutoutExtension, ModBlocks.LADYS_GOWN.get());
        event.registerBlock(cutoutExtension, ModBlocks.FROST_BERRY.get());
        event.registerBlock(cutoutExtension, ModBlocks.SPRING_BUTTERCUP.get());
        event.registerBlock(cutoutExtension, ModBlocks.LADYS_BUTTON.get());
        event.registerBlock(cutoutExtension, ModBlocks.HEART_BOWL.get());
        event.registerBlock(cutoutExtension, ModBlocks.PINK_GRACE.get());
        event.registerBlock(cutoutExtension, ModBlocks.MOTHERS_ROSE.get());
        event.registerBlock(cutoutExtension, ModBlocks.INNER_PEACE.get());
        event.registerBlock(cutoutExtension, ModBlocks.WISHING_TULIP.get());
        event.registerBlock(cutoutExtension, ModBlocks.ORANGE_BELL.get());
        event.registerBlock(cutoutExtension, ModBlocks.DREAM_STARS.get());
        event.registerBlock(cutoutExtension, ModBlocks.ARADIA.get());
        event.registerBlock(cutoutExtension, ModBlocks.SEMPITERNAL.get());
        event.registerBlock(cutoutExtension, ModBlocks.NOON_DREAM.get());
        event.registerBlock(cutoutExtension, ModBlocks.PRAIRIE_HEART.get());
        event.registerBlock(cutoutExtension, ModBlocks.AURORA.get());
        event.registerBlock(cutoutExtension, ModBlocks.FRIENDSHIP_ROSE.get());
        event.registerBlock(cutoutExtension, ModBlocks.XANAS_CHARM.get());
        event.registerBlock(cutoutExtension, ModBlocks.LOVE_EVERLASTING.get());
        event.registerBlock(cutoutExtension, ModBlocks.REMEMBRANCE.get());
        event.registerBlock(cutoutExtension, ModBlocks.ICY_DROP.get());
        event.registerBlock(cutoutExtension, ModBlocks.WINTER_SOLACE.get());
        event.registerBlock(cutoutExtension, ModBlocks.POINSETTIA.get());
        event.registerBlock(cutoutExtension, ModBlocks.EDELWEISS.get());
        event.registerBlock(cutoutExtension, ModBlocks.LAVENDER_STAR.get());
        event.registerBlock(cutoutExtension, ModBlocks.BLUE_LYS.get());
        event.registerBlock(cutoutExtension, ModBlocks.QUEENS_GUARD.get());
        event.registerBlock(cutoutExtension, ModBlocks.WINTERS_END.get());
        event.registerBlock(cutoutExtension, ModBlocks.NEW_YEARS_WISH.get());
        event.registerBlock(cutoutExtension, ModBlocks.SKYS_EDGE.get());
        event.registerBlock(cutoutExtension, ModBlocks.FOYS_TREASURE.get());
        event.registerBlock(cutoutExtension, ModBlocks.SNAPPY_FLOWER.get());
        event.registerBlock(cutoutExtension, ModBlocks.MAY_FLOWER.get());
        event.registerBlock(cutoutExtension, ModBlocks.SUMMER_FINGERS.get());
        event.registerBlock(cutoutExtension, ModBlocks.P_GAMERALUM.get());
        event.registerBlock(cutoutExtension, ModBlocks.PURPLE_TENDRILS.get());
        event.registerBlock(cutoutExtension, ModBlocks.MOON_CRAVER.get());
        event.registerBlock(cutoutExtension, ModBlocks.APPERA_BLOSSOM.get());
        event.registerBlock(cutoutExtension, ModBlocks.TULIP_GAMEORA.get());
        event.registerBlock(cutoutExtension, ModBlocks.SPRING_TOUCH.get());
        event.registerBlock(cutoutExtension, ModBlocks.ALL_HALLOWS_EVE.get());
        event.registerBlock(cutoutExtension, ModBlocks.GLOWGRASS.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_LOG.get());
        event.registerBlock(cutoutExtension, ModBlocks.STRIPPED_TERMINUS_SPLIT_LOG.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_WOOD.get());
        event.registerBlock(cutoutExtension, ModBlocks.STRIPPED_TERMINUS_SPLIT_WOOD.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_PLANKS.get());
        event.registerBlock(cutoutExtension, StarBlocks.FLAREWOOD_LEAVES.get());
        event.registerBlock(cutoutExtension, StarBlocks.FLAREWOOD_SAPLING.get());
        event.registerBlock(cutoutExtension, StarBlocks.FLAREWOOD_DOOR.get());
        event.registerBlock(cutoutExtension, StarBlocks.FLAREWOOD_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, StarBlocks.CORONA_BLOOM_LEAVES.get());
        event.registerBlock(cutoutExtension, StarBlocks.CORONA_BLOOM_SAPLING.get());
        event.registerBlock(cutoutExtension, StarBlocks.CORONA_BLOOM_DOOR.get());
        event.registerBlock(cutoutExtension, StarBlocks.CORONA_BLOOM_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.LUNAR_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.BLOOM_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.DRIFT_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.VACUUM_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.LUNAR_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.LUNAR_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.LUNAR_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.BLOOM_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.BLOOM_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.BLOOM_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.DRIFT_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.DRIFT_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.DRIFT_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.VACUUM_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.VACUUM_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.VACUUM_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.HELIOSPIRE_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.HELIOSPIRE_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.HELIOSPIRE_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.HELIOSPIRE_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.UMBRA_ROOT_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.UMBRA_ROOT_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.UMBRA_ROOT_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.UMBRA_ROOT_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.TERMINUS_SPLIT_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.FERRIC_SPINE_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.FERRIC_SPINE_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.FERRIC_SPINE_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.FERRIC_SPINE_TRAPDOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.CRYOSTEM_LEAVES.get());
        event.registerBlock(cutoutExtension, ModBlocks.CRYOSTEM_SAPLING.get());
        event.registerBlock(cutoutExtension, ModBlocks.CRYOSTEM_DOOR.get());
        event.registerBlock(cutoutExtension, ModBlocks.CRYOSTEM_TRAPDOOR.get());
    }
}
