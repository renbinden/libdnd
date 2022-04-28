package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public abstract class Elf extends Race {
    public Elf(String name) {
        super(
                name,
                100,
                750,
                new Distance(5, FEET),
                new Distance(6, FEET),
                new Distance(30, FEET),
                new Distance(60, FEET)
        );
    }
}
