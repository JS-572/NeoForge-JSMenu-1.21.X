package net.js.jsmenu.space.moon;

import net.js.jsmenu.space.SpaceDimensions;

import java.util.List;
import java.util.Optional;

public class Moons {
    public static final Moon MOON = new Moon("moon", "Moon",450.0D, 12.0D,
            "Our only moon and our most well-known. The Moon! Earth's natural satellite maintains the ocean tides and keeps the Earth's axial tilt steady.",
            SpaceDimensions.MOON, SpaceDimensions.MOON_LIFE);

    public static final Moon PHOBOS = new Moon("phobos", "Phobos",685.8D, 30.0D,
            "The larger of Mars' 2 moons. It orbits Mars 3 times in one day.",
            SpaceDimensions.PHOBOS, SpaceDimensions.PHOBOS);
    public static final Moon DEIMOS = new Moon("deimos", "Deimos",685.8D, 14.0D,
            "The smaller of Mars' 2 moons. It orbits Mars once every 30 hours.",
            SpaceDimensions.DEIMOS, SpaceDimensions.DEIMOS);

    private static final List<Moon> MOONS = List.of(MOON, PHOBOS, DEIMOS);

    private Moons() {
    }

    public static List<Moon> getMoons() {
        return MOONS;
    }

    public static Optional<Moon> getMoon(String id) {
        return MOONS.stream()
                .filter(moon -> moon.getId().equals(id))
                .findFirst();
    }
}
