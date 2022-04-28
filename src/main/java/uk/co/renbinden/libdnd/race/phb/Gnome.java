package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public abstract class Gnome extends Race {
    public Gnome(String name) {
        super(
                name,
                40,
                500,
                new Distance(3, FEET),
                new Distance(4, FEET),
                new Distance(25, FEET),
                new Distance(60, FEET)
        );
    }
}
