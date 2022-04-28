package uk.co.renbinden.libdnd.item.tool.vehicle;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.item.tool.ToolType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

public class VehicleType extends ToolType {
    private final Distance speed;

    public VehicleType(String identifier, String name, Money cost, Weight weight, Distance speed) {
        super(identifier, name, cost, weight);
        this.speed = speed;
    }

    public Distance getSpeed() {
        return speed;
    }
}
