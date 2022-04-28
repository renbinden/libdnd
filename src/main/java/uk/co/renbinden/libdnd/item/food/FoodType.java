package uk.co.renbinden.libdnd.item.food;

import uk.co.renbinden.libdnd.item.ItemType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public class FoodType implements ItemType {
    private final String identifier;
    private final String name;
    private final Money cost;
    private final Weight weight;

    public FoodType(String identifier, String name, Money cost) {
        this.identifier = identifier;
        this.name = name;
        this.cost = cost;
        this.weight = new Weight(0, LB);
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Money getCost() {
        return cost;
    }

    @Override
    public Weight getWeight() {
        return weight;
    }
}
