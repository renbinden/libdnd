package uk.co.renbinden.libdnd.item.pack;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

public class EquipmentPack {

    private final String name;
    private final Money cost;
    private final List<Item<?>> items;

    public EquipmentPack(String name, Money cost, List<Item<?>> items) {
        this.name = name;
        this.cost = cost;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Money getCost() {
        return cost;
    }

    public List<Item<?>> getItems() {
        return items;
    }

}
