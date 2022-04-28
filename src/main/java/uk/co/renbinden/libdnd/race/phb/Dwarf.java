package uk.co.renbinden.libdnd.race.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.race.HpBonusFunction;
import uk.co.renbinden.libdnd.race.Race;

import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;

public abstract class Dwarf extends Race {

    public Dwarf(String name, HpBonusFunction hpBonusFunction) {
        super(
                name,
                50,
                350,
                new Distance(4, FEET),
                new Distance(5, FEET),
                new Distance(25, FEET),
                new Distance(60, FEET),
                hpBonusFunction
        );
    }

    public Dwarf(String name) {
        this(
                name,
                level -> 0
        );
    }
}
