package uk.co.renbinden.libdnd.distance;

public final class DistanceUnit {

    public static final DistanceUnit MILES = new DistanceUnit("mi", 5);
    public static final DistanceUnit FEET = new DistanceUnit("ft", 26400);
    public static final DistanceUnit INCHES = new DistanceUnit("in", 316800);

    public static final DistanceUnit KILOMETRES = new DistanceUnit("km", 8);
    public static final DistanceUnit METRES = new DistanceUnit("m", 8000);
    public static final DistanceUnit CENTIMETRES = new DistanceUnit("cm", 800000);

    private final String name;
    private final double scaleFactor;

    private DistanceUnit(String name, int scaleFactor) {
        this.name = name;
        this.scaleFactor = scaleFactor;
    }

    public String getName() {
        return name;
    }

    public double getScaleFactor() {
        return scaleFactor;
    }
}
