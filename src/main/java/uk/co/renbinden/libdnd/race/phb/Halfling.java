package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public abstract class Halfling extends Race {
    public Halfling(String name) {
        super(
                name,
                20,
                250,
                new Distance(3, FEET),
                new Distance(3, FEET),
                new Distance(25, FEET),
                new Distance(0, FEET)
        );
    }
}
