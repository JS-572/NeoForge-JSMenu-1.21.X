package net.js.jsmenu.space.planet;

import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;

public class Planets {
    public static final Planet EARTH = new Planet("earth", "Earth", 120.0D, 0.0D, "Home world with breathable air, liquid water, and familiar life.", Level.OVERWORLD, Level.OVERWORLD, PlanetType.TERRESTRIAL);

    private static final List<Planet> PLANETS = List.of(EARTH);

    private Planets() {
    }

    public static List<Planet> getPlanets() {
        return PLANETS;
    }

    public static Optional<Planet> getPlanet(String id) {
        return PLANETS.stream()
                .filter(planet -> planet.getId().equals(id))
                .findFirst();
    }
}
