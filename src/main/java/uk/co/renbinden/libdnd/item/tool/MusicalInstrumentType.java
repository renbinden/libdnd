package uk.co.renbinden.libdnd.item.tool;

import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

public class MusicalInstrumentType extends ToolType {
    public MusicalInstrumentType(String identifier, String name, Money cost, Weight weight) {
        super(identifier, name, cost, weight);
    }
}
