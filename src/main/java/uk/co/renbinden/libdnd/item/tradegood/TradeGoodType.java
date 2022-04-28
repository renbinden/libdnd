package uk.co.renbinden.libdnd.item.tradegood;

import uk.co.renbinden.libdnd.item.ItemType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

public class TradeGoodType implements ItemType {

    private final String identifier;
    private final String name;
    private final Money cost;
    private final Weight weight;

    public TradeGoodType(String identifier, String name, Money cost, Weight weight) {
        this.identifier = identifier;
        this.name = name;
        this.cost = cost;
        this.weight = weight;
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
