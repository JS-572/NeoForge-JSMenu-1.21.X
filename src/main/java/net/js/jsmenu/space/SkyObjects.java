package net.js.jsmenu.space;

import net.js.jsmenu.space.moon.Moon;
import net.js.jsmenu.space.moon.Moons;
import net.js.jsmenu.space.planet.Planet;
import net.js.jsmenu.space.planet.Planets;
import net.js.jsmenu.space.star.Star;
import net.js.jsmenu.space.star.Stars;
import net.minecraft.resources.ResourceLocation;

public final class SkyObjects {
    public static final SpaceObject SUN = Stars.SUN;
    public static final SpaceObject MOON = Moons.MOON;
    public static final SpaceObject MERCURY = Planets.MERCURY;
    public static final SpaceObject VENUS = Planets.VENUS;
    public static final SpaceObject EARTH = Planets.EARTH;
    public static final SpaceObject MARS = Planets.MARS;
    public static final SpaceObject PHOBOS = Moons.PHOBOS;
    public static final SpaceObject DEIMOS = Moons.DEIMOS;
    private static boolean registered;

    private SkyObjects() {
    }

    public static synchronized void registerAllSkies() {
        if (registered) {
            return;
        }

        registerPlanetSkies(Planets.MERCURY, Planets.VENUS, Planets.EARTH, Planets.MARS);
        registerStarSkies(Stars.SUN);
        registerMoonSkies(Moons.MOON, Moons.PHOBOS, Moons.DEIMOS);
        registered = true;
    }

    public static void registerPlanetSkies(Planet mercury,
                                           Planet venus,
                                           Planet earth,
                                           Planet mars) {
        registerMercurySky(mercury);
        registerVenusSky(venus);
        registerEarthSky(earth);
        registerMarsSky(mars);
    }

    public static void registerStarSkies(Star sun) {
        registerSunSky(sun);
    }

    public static void registerMoonSkies(Moon moon,
                                         Moon phobos,
                                         Moon deimos) {
        registerMoonSky(moon);
        registerPhobosSky(phobos);
        registerDeimosSky(deimos);
    }

    private static void registerMercurySky(Planet mercury) {
        mercury.registerSkyObject(entry(SUN, 2.58F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).at(2111300).fixed()))
                .registerSkyObject(entry(VENUS, 0.029F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).conjunction(0).westernQuadrature(3166950).opposition(2111300).easternQuadrature(1055650),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).conjunction(2111300).westernQuadrature(1055650).opposition(0).easternQuadrature(3166950)))
                .registerSkyObject(entry(EARTH, 0.0021F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).conjunction(1200).westernQuadrature(3168150).opposition(2112500).easternQuadrature(1056850),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).conjunction(2112500).westernQuadrature(1056850).opposition(1200).easternQuadrature(3168150)))
                .registerSkyObject(entry(MARS, 0.000045F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).conjunction(4221400).westernQuadrature(3165750).opposition(2110100).easternQuadrature(1054450),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.MERCURY_TICKS_PER_DAY).conjunction(2110100).westernQuadrature(1054450).opposition(4221400).easternQuadrature(3165750)));

    }

    private static void registerVenusSky(Planet venus) {
        venus.registerSkyObject(entry(SUN, 1.38F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).at(2916271.2).fixed()))
                .registerSkyObject(entry(MERCURY, 0.0045F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(5308423.7).greatestEasternElongation(524118.7),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).conjunction(2916271.2).greatestWesternElongation(2392152.5).greatestEasternElongation(3440389.9)))
                .registerSkyObject(entry(EARTH, 0.033F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).conjunction(0).westernQuadrature(4374406.8).opposition(2916271.2).easternQuadrature(1458135.6),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).conjunction(2916271.2).westernQuadrature(1458135.6).opposition(0).easternQuadrature(4374406.8)))
                .registerSkyObject(entry(MARS, 0.003F,
                        AverageTimeOfDay.rise().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).conjunction(2000).westernQuadrature(4376406.8).opposition(2918271.2).easternQuadrature(1460135.6),
                        AverageTimeOfDay.set().withTicksPerDay(AverageTimeOfDay.VENUS_TICKS_PER_DAY).conjunction(2918271.2).westernQuadrature(1460135.6).opposition(2000).easternQuadrature(4376406.8)));
    }

    private static void registerEarthSky(Planet earth) {
        earth.registerSkyObject(entry(SUN, 1.0F))
                .registerSkyObject(entry(MOON, 1.0F))
                .registerSkyObject(entry(MARS, 0.008F,
                        AverageTimeOfDay.rise().conjunction(6000).westernQuadrature(0).opposition(18000).easternQuadrature(12000),
                        AverageTimeOfDay.set().conjunction(18000).westernQuadrature(12000).opposition(6000).easternQuadrature(0))
                                .withSkyInclination(1.85F))
                .registerSkyObject(entry(VENUS, 0.02F,
                        AverageTimeOfDay.rise().maximumMorningStar(3000).superiorConjunction(6000).maximumEveningStar(9000),
                        AverageTimeOfDay.set().maximumMorningStar(15000).superiorConjunction(18000).maximumEveningStar(21000))
                                .withSkyInclination(3.39F))
                .registerSkyObject(entry(MERCURY, 0.0057F,
                        AverageTimeOfDay.rise().conjunction(6000).greatestEasternElongation(7533).greatestWesternElongation(4533),
                        AverageTimeOfDay.set().conjunction(18000).greatestEasternElongation(19533).greatestWesternElongation(16533))
                                .withSkyInclination(7.0F));
    }

    private static void registerMarsSky(Planet mars) {
        mars.registerSkyObject(entry(SUN, 0.66F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MARS_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.MARS_TICKS_PER_DAY).at(12329.9).fixed()))
                .registerSkyObject(entry(MERCURY, 0.0023F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MARS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(23651.64).greatestEasternElongation(1008.15),
                        AverageTimeOfDay.set(AverageTimeOfDay.MARS_TICKS_PER_DAY).conjunction(12329.9).greatestWesternElongation(11321.75).greatestEasternElongation(13338.05))
                        .withSkyInclination(14.72F))
                .registerSkyObject(entry(VENUS, 0.0061F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MARS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(22718.41).greatestEasternElongation(1941.38),
                        AverageTimeOfDay.set(AverageTimeOfDay.MARS_TICKS_PER_DAY).conjunction(12329.9).greatestWesternElongation(10388.52).greatestEasternElongation(14271.28))
                        .withSkyInclination(28.34F))
                .registerSkyObject(entry(EARTH, 0.0069F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MARS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(21850.03).greatestEasternElongation(2809.76),
                        AverageTimeOfDay.set(AverageTimeOfDay.MARS_TICKS_PER_DAY).conjunction(12329.9).greatestWesternElongation(9520.14).greatestEasternElongation(15139.66))
                        .withSkyInclination(41.02F))
                .registerSkyObject(entry(PHOBOS, 0.34F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MARS_TICKS_PER_DAY).at(0).at(8219.93).at(16439.86).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.MARS_TICKS_PER_DAY).at(5219.93).at(13439.86).at(21659.79).fixed()))
                .registerSkyObject(entry(DEIMOS, 0.0062F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MARS_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.MARS_TICKS_PER_DAY).at(18329.7)));

    }

    private static void registerSunSky(Star sun) {
        sun.registerSkyObject(entry(MERCURY, 0.0091F,
                AverageTimeOfDay.rise(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(0).fixed(),
                AverageTimeOfDay.set(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(324000).fixed())
                        .withSkyInclination(3.38F))
                .registerSkyObject(entry(VENUS, 0.012F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(324000).fixed())
                        .withSkyInclination(3.86F))
                .registerSkyObject(entry(EARTH, 0.0091F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(324000).fixed())
                        .withSkyInclination(20.5F))
                .registerSkyObject(entry(MARS, 0.0032F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.SUN_TICKS_PER_DAY).at(324000).fixed())
                        .withSkyInclination(5.65F));
    }

    private static void registerMoonSky(Moon moon) {
        moon.registerSkyObject(entry(MERCURY, 0.0034F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MOON_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(607006.71).greatestEasternElongation(40993.29),
                        AverageTimeOfDay.set(AverageTimeOfDay.MOON_TICKS_PER_DAY).conjunction(324000).greatestWesternElongation(283006.71).greatestEasternElongation(364993.29))
                        .withSkyInclination(7F))
                .registerSkyObject(entry(VENUS, 0.0076F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MOON_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(564605.52).greatestEasternElongation(83394.48),
                        AverageTimeOfDay.set(AverageTimeOfDay.MOON_TICKS_PER_DAY).conjunction(324000).greatestWesternElongation(240605.52).greatestEasternElongation(407394.48))
                        .withSkyInclination(3.39F))
                .registerSkyObject(entry(EARTH, 3.56F).withSkyInclination(5.14F))
                .registerSkyObject(entry(MARS, 0.0029F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.MOON_TICKS_PER_DAY).conjunction(0).westernQuadrature(486000).opposition(324000).easternQuadrature(162000),
                        AverageTimeOfDay.set(AverageTimeOfDay.MOON_TICKS_PER_DAY).conjunction(324000).westernQuadrature(162000).opposition(0).easternQuadrature(486000))
                        .withSkyInclination(1.85F))
                .registerSkyObject(entry(SUN, 1.0F));
    }

    private static void registerPhobosSky(Moon phobos) {
        phobos.registerSkyObject(entry(MERCURY, 0.0023F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(7340.44).greatestEasternElongation(312.89),
                        AverageTimeOfDay.set(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).conjunction(3826.66666666666666666666666666).greatestWesternElongation(3513.77).greatestEasternElongation(4139.56))
                        .withSkyInclination(7.0F))
                .registerSkyObject(entry(VENUS, 0.0061F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).conjunction(0).greatestEasternElongation(602.49).greatestWesternElongation(7050.84),
                        AverageTimeOfDay.set(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).conjunction(3826.66666666666).greatestEasternElongation(4429.16).greatestWesternElongation(3224.17))
                        .withSkyInclination(3.39F))
                .registerSkyObject(entry(EARTH, 0.0069F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(6781.25).greatestEasternElongation(872.08),
                        AverageTimeOfDay.set(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).conjunction(3826.6666666666).greatestWesternElongation(2954.58).greatestEasternElongation(4698.75))
                )
                .registerSkyObject(entry(MARS, 74.6F).withSkyInclination(25.19F))
                .registerSkyObject(entry(SUN, 0.66F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).at(3826.666666666666666666666666666666666666666666666666666).fixed())
                        .withSkyInclination(1.85F))
                .registerSkyObject(entry(DEIMOS, 0.059F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).at(3826.66666666666666666666666666666666666666666666666666).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.PHOBOS_TICKS_PER_DAY).at(0).fixed())
                        .withSkyInclination(25.19F));
    }

    private static void registerDeimosSky(Moon deimos) {
        deimos.registerSkyObject(entry(MERCURY, 0.0023F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(29072.58).greatestEasternElongation(16395.42),
                        AverageTimeOfDay.set(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).conjunction(15156).greatestWesternElongation(13916.58).greatestEasternElongation(16395.42))
                        .withSkyInclination(7.0F))
                .registerSkyObject(entry(VENUS, 0.0061F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(27925.77).greatestEasternElongation(2386.23),
                        AverageTimeOfDay.set(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).conjunction(15156).greatestWesternElongation(12769.77).greatestEasternElongation(17542.23))
                        .withSkyInclination(3.39F))
                .registerSkyObject(entry(EARTH, 0.0069F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).conjunction(0).greatestWesternElongation(26858.12).greatestEasternElongation(11702.12),
                        AverageTimeOfDay.set(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).conjunction(15156).greatestWesternElongation(11702.12).greatestEasternElongation(18609.88)))
                .registerSkyObject(entry(MARS, 30.8F).withSkyInclination(25.19F))
                .registerSkyObject(entry(SUN, 0.66F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).at(0).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).at(15156).fixed())
                        .withSkyInclination(1.85F))
                .registerSkyObject(entry(PHOBOS, 0.099F,
                        AverageTimeOfDay.rise(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).at(0).at(10238.37).at(20476.74).fixed(),
                        AverageTimeOfDay.set(AverageTimeOfDay.DEIMOS_TICKS_PER_DAY).at(5119.19).at(15357.56).at(25595.93).fixed())
                        .withSkyInclination(1.79F));
    }

    private static SkyObject entry(SpaceObject object, float size, AverageTimeOfDay timeOfDayRising, AverageTimeOfDay timeOfDaySetting) {
        return entry(object, size).withTimes(timeOfDayRising, timeOfDaySetting);
    }

    private static SkyObject entry(SpaceObject object, float size) {
        String texturePath = switch (object.getId()) {
            case "sun" -> "star/sun";
            case "moon", "phobos", "deimos" -> "moon/moon";
            default -> "planet/" + object.getId();
        };
        return new SkyObject(
                object.getId(),
                ResourceLocation.fromNamespaceAndPath("jsmenu", "textures/space_objects/" + texturePath + ".png"),
                size,
                null,
                null,
                0.0F
        );
    }
}