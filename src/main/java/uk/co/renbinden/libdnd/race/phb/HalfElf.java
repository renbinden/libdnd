package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public class HalfElf extends Race {
    public HalfElf() {
        super(
                "Half-Elf",
                20,
                200,
                new Distance(5, FEET),
                new Distance(6, FEET),
                new Distance(30, FEET),
                new Distance(60, FEET)
        );
    }
}
