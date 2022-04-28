package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public class Dragonborn extends Race {
    public Dragonborn() {
        super(
                "Dragonborn",
                15,
                80,
                new Distance(6, FEET),
                new Distance(8, FEET),
                new Distance(30, FEET),
                new Distance(0, FEET)
        );
    }
}
