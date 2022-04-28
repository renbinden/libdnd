package uk.co.renbinden.libdnd.item.tool.vehicle;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public class WaterborneVehicleType extends VehicleType {
    public WaterborneVehicleType(String identifier, String name, Money cost, Distance speed) {
        super(identifier, name, cost, new Weight(0, LB), speed);
    }
}
