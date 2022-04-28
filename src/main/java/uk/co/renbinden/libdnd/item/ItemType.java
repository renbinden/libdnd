package uk.co.renbinden.libdnd.item;

import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

public interface ItemType {

    String getIdentifier();
    String getName();
    Money getCost();
    Weight getWeight();

}
