package uk.co.renbinden.libdnd.item.tool.vehicle;

import uk.co.renbinden.libdnd.item.tool.ToolType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

public class SaddleType extends ToolType {
    public SaddleType(String identifier, String name, Money cost, Weight weight) {
        super(identifier, name, cost, weight);
    }
}
