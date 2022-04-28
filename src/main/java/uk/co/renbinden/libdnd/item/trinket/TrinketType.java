package uk.co.renbinden.libdnd.item.trinket;

import uk.co.renbinden.libdnd.item.ItemType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.money.Currency.CP;
import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public class TrinketType implements ItemType {
    private final String identifier;
    private final String name;
    private final Money cost;
    private final Weight weight;

    public TrinketType(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
        this.cost = new Money(0, CP);
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
