package net.js.jsmenu.space;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public final class AverageTimeOfDay {
    public static final int SKY_EVENT_CYCLE_DAYS = 100;
    public static final double EARTH_TICKS_PER_DAY = 24000.0;
    public static final double SUN_TICKS_PER_DAY = 648000.0;
    public static final double MOON_TICKS_PER_DAY = 648000.0;
    public static final double MERCURY_TICKS_PER_DAY = 4222600;
    public static final double VENUS_TICKS_PER_DAY = 5832542.4;
    public static final double MARS_TICKS_PER_DAY = 24659.79;
    public static final double PHOBOS_TICKS_PER_DAY = 7653.333333333333;
    public static final double DEIMOS_TICKS_PER_DAY = 30312;

    private final double ticksPerDay;
    private final Map<String, Double> eventTimes;
    private final boolean fixed;

    private AverageTimeOfDay(double ticksPerDay) {
        if (!Double.isFinite(ticksPerDay) || ticksPerDay <= 0.0) {
            throw new IllegalArgumentException("Ticks per day must be a positive finite number");
        }
        this.ticksPerDay = ticksPerDay;
        this.eventTimes = Map.of();
        this.fixed = false;
    }

    private AverageTimeOfDay(double ticksPerDay, Map<String, Double> eventTimes, boolean fixed) {
        this.ticksPerDay = ticksPerDay;
        this.eventTimes = Collections.unmodifiableMap(new LinkedHashMap<>(eventTimes));
        this.fixed = fixed;
    }

    public static AverageTimeOfDay rise() {
        return rise(EARTH_TICKS_PER_DAY);
    }

    public static AverageTimeOfDay rise(double ticksPerDay) {
        return new AverageTimeOfDay(ticksPerDay);
    }

    public static AverageTimeOfDay set() {
        return set(EARTH_TICKS_PER_DAY);
    }

    public static AverageTimeOfDay set(double ticksPerDay) {
        return new AverageTimeOfDay(ticksPerDay);
    }

    public AverageTimeOfDay withTicksPerDay(double ticksPerDay) {
        if (!Double.isFinite(ticksPerDay) || ticksPerDay <= 0.0
                || this.eventTimes.values().stream().anyMatch(ticks -> ticks >= ticksPerDay)) {
            throw new IllegalArgumentException("Ticks per day must be positive, finite, and greater than all configured times");
        }
        return new AverageTimeOfDay(ticksPerDay, this.eventTimes, this.fixed);
    }

    public AverageTimeOfDay conjunction(double ticks) {
        return withEvent("conjunction", ticks);
    }

    public AverageTimeOfDay at(double ticks) {
        return withEvent("fixed", ticks);
    }

    public AverageTimeOfDay westernQuadrature(double ticks) {
        return withEvent("westernQuadrature", ticks);
    }

    public AverageTimeOfDay opposition(double ticks) {
        return withEvent("opposition", ticks);
    }

    public AverageTimeOfDay easternQuadrature(double ticks) {
        return withEvent("easternQuadrature", ticks);
    }

    public AverageTimeOfDay maximumMorningStar(double ticks) {
        return withEvent("maximumMorningStar", ticks);
    }

    public AverageTimeOfDay superiorConjunction(double ticks) {
        return withEvent("superiorConjunction", ticks);
    }

    public AverageTimeOfDay maximumEveningStar(double ticks) {
        return withEvent("maximumEveningStar", ticks);
    }

    public AverageTimeOfDay greatestEasternElongation(double ticks) {
        return withEvent("greatestEasternElongation", ticks);
    }

    public AverageTimeOfDay greatestWesternElongation(double ticks) {
        return withEvent("greatestWesternElongation", ticks);
    }

    public AverageTimeOfDay fixed() {
        return new AverageTimeOfDay(this.ticksPerDay, this.eventTimes, true);
    }

    public OptionalDouble timeFor(String event) {
        Double time = this.eventTimes.get(event);
        return time == null ? OptionalDouble.empty() : OptionalDouble.of(time);
    }

    public OptionalDouble firstTime() {
        return this.eventTimes.values().stream().mapToDouble(Double::doubleValue).findFirst();
    }

    public boolean hasSameEventSequence(AverageTimeOfDay other) {
        return Double.compare(this.ticksPerDay, other.ticksPerDay) == 0
                && this.fixed == other.fixed
                && List.copyOf(this.eventTimes.keySet()).equals(List.copyOf(other.eventTimes.keySet()));
    }

    public OptionalDouble timeAtCycle(long worldTime, float partialTick) {
        if (this.eventTimes.isEmpty()) {
            return OptionalDouble.empty();
        }
        if (this.fixed) {
            return firstTime();
        }

        List<Double> times = List.copyOf(this.eventTimes.values());
        double cycleLength = (double) SKY_EVENT_CYCLE_DAYS * EARTH_TICKS_PER_DAY;
        double cyclePosition = Math.floorMod(worldTime, (long) cycleLength) + partialTick;
        double eventPosition = cyclePosition / cycleLength * times.size();
        int currentIndex = (int) eventPosition;
        int nextIndex = (currentIndex + 1) % times.size();
        double progress = eventPosition - currentIndex;

        double currentTime = times.get(currentIndex);
        double nextTime = times.get(nextIndex);
        double shortestDayDelta = wrap(nextTime - currentTime + this.ticksPerDay / 2.0, this.ticksPerDay)
                - this.ticksPerDay / 2.0;
        double interpolatedTime = currentTime + shortestDayDelta * progress;
        return OptionalDouble.of(wrap(interpolatedTime, this.ticksPerDay));
    }

    public double ticksPerDay() {
        return this.ticksPerDay;
    }

    public Map<String, Double> eventTimes() {
        return this.eventTimes;
    }

    private AverageTimeOfDay withEvent(String event, double ticks) {
        if (!Double.isFinite(ticks) || ticks < 0.0 || ticks >= this.ticksPerDay) {
            throw new IllegalArgumentException("Time of day must be in the range [0, ticks per day)");
        }
        Map<String, Double> updatedTimes = new LinkedHashMap<>(this.eventTimes);
        updatedTimes.put(event, ticks);
        return new AverageTimeOfDay(this.ticksPerDay, updatedTimes, this.fixed);
    }

    private static double wrap(double value, double modulus) {
        return value - Math.floor(value / modulus) * modulus;
    }

}
