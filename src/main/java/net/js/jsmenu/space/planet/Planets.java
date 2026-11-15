package net.js.jsmenu.space.planet;

import net.js.jsmenu.space.SpaceDimensions;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.Optional;

public class Planets {
    public static final Planet MERCURY = new Planet("mercury", "Mercury", 174.2D, 21.3D,
            "Closest planet to the Sun. Smallest one we know yet has no moons since it's too close to the Sun.",
            SpaceDimensions.MERCURY, SpaceDimensions.MERCURY_LIFE, PlanetType.TERRESTRIAL, PlanetRotation.PROGRADE, 4222600, 3.8F, new Vec3(0.0, 0.0, 0.0));
    public static final Planet VENUS = new Planet("venus", "Venus", 325.4D, 19.3D,
            "Second and Hottest Planet our the Solar System. And once had a moon before it crashed into the Planet. With an approximate temperature of about 900 degrees Celsius, it has tons of active volcanoes. A planet that used to be habitable went extinct from a runaway Greenhouse Effect approximately 700 million years ago.",
            SpaceDimensions.VENUS, SpaceDimensions.VENUS_LIFE, PlanetType.TERRESTRIAL, PlanetRotation.RETROGRADE, 5832542.4, 1.8F, new Vec3(0.4, 0.3, 0.1));
    public static final Planet EARTH = new Planet("earth", "Earth", 450.0D, 0.0D,
            "Home world with breathable air, liquid water, and familiar life.",
            Level.OVERWORLD, Level.OVERWORLD, PlanetType.TERRESTRIAL, PlanetRotation.PROGRADE, 24000F, 1.0F, new Vec3(0.0, 0.0, 0.0));
    public static final Planet MARS = new Planet("mars", "Mars", 685.8D, 22.1D,
            "The fourth planet from the Sun. This planet lost its atmosphere around 3.6 billion years ago, about 700 million years after its magnetic field shut down. But this planet is expected to be habitable again one day. It has the largest known volcano in the solar system. Olympus Mons. Which is roughly 3 times the height of Mount Everest, Earth's highest and 2nd tallest mountain.",
            SpaceDimensions.MARS, SpaceDimensions.MARS_LIFE, PlanetType.TERRESTRIAL, PlanetRotation.PROGRADE, 24659.79, 0.6F, new Vec3(0.35, 0.2, 0.15));

    private static final List<Planet> PLANETS = List.of(MERCURY, VENUS, EARTH, MARS);
    private static final List<Planet> DWARF_PLANETS = List.of();
    private static final List<Planet> DWARF_PLANET_CANDIDATES = List.of();

    private Planets() {
    }

    public static List<Planet> getPlanets() {
        return PLANETS;
    }
    public static List<Planet> getDwarfPlanets() {
        return DWARF_PLANETS;
    }
    public static List<Planet> getDwarfPlanetCandidates() {
        return DWARF_PLANET_CANDIDATES;
    }

    public static Optional<Planet> getPlanet(String id) {
        return PLANETS.stream()
                .filter(planet -> planet.getId().equals(id))
                .findFirst();
    }

    public static Optional<Planet> getDwarfPlanet(String id) {
        return DWARF_PLANETS.stream()
                .filter(planet -> planet.getId().equals(id))
                .findFirst();
    }

    public static Optional<Planet> getDwarfPlanetCandidate(String id) {
        return DWARF_PLANET_CANDIDATES.stream()
                .filter(planet -> planet.getId().equals(id))
                .findFirst();
    }
}
