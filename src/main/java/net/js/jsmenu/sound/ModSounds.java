package net.js.jsmenu.sound;

import net.js.jsmenu.JSMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, JSMenu.MOD_ID);
    public static final Supplier<SoundEvent> PLANET_MERCURY = registerSoundEvent("planet_mercury");
    public static final ResourceKey<JukeboxSong> PLANET_MERCURY_KEY = createSong("planet_mercury");
    public static final Supplier<SoundEvent> PLANET_VENUS = registerSoundEvent("planet_venus");
    public static final ResourceKey<JukeboxSong> PLANET_VENUS_KEY = createSong("planet_venus");
    public static final Supplier<SoundEvent> PLANET_EARTH = registerSoundEvent("planet_earth");
    public static final ResourceKey<JukeboxSong> PLANET_EARTH_KEY = createSong("planet_earth");
    public static final Supplier<SoundEvent> PLANET_MARS = registerSoundEvent("planet_mars");
    public static final ResourceKey<JukeboxSong> PLANET_MARS_KEY = createSong("planet_mars");

    public static final Supplier<SoundEvent> STAR_SUN = registerSoundEvent("star_sun");
    public static final ResourceKey<JukeboxSong> STAR_SUN_KEY = createSong("star_sun");
    private static ResourceKey<JukeboxSong> createSong(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(JSMenu.MOD_ID, name));
    }

    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(JSMenu.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
