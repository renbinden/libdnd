package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public class HalfOrc extends Race {
    public HalfOrc() {
        super(
                "Half-Orc",
                14,
                75,
                new Distance(5, FEET),
                new Distance(8, FEET),
                new Distance(30, FEET),
                new Distance(0, FEET)
        );
    }
}
