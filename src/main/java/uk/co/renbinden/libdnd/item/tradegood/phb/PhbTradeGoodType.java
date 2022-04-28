package uk.co.renbinden.libdnd.item.tradegood.phb;

import uk.co.renbinden.libdnd.item.tradegood.TradeGoodType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.money.Currency.*;
import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public final class PhbTradeGoodType {
    public static final TradeGoodType WHEAT = new TradeGoodType(
            "wheat",
            "Wheat",
            new Money(1, CP),
            new Weight(1, LB)
    );
    public static final TradeGoodType FLOUR = new TradeGoodType(
            "flour",
            "Flour",
            new Money(2, CP),
            new Weight(1, LB)
    );
    public static final TradeGoodType CHICKEN = new TradeGoodType(
            "chicken",
            "Chicken",
            new Money(2, CP),
            new Weight(1, LB)
    );
    public static final TradeGoodType SALT = new TradeGoodType(
            "salt",
            "Salt",
            new Money(5, CP),
            new Weight(1, LB)
    );
    public static final TradeGoodType IRON = new TradeGoodType(
            "iron",
            "Iron",
            new Money(1, SP),
            new Weight(1, LB)
    );
    public static final TradeGoodType CANVAS = new TradeGoodType(
            "canvas",
            "Canvas",
            new Money(1, SP),
            new Weight(1, LB)
    );
    public static final TradeGoodType COPPER = new TradeGoodType(
            "copper",
            "Copper",
            new Money(5, SP),
            new Weight(1, LB)
    );
    public static final TradeGoodType COTTON_CLOTH = new TradeGoodType(
            "cotton_cloth",
            "Cotton cloth",
            new Money(5, SP),
            new Weight(1, LB)
    );
    public static final TradeGoodType GINGER = new TradeGoodType(
            "ginger",
            "Ginger",
            new Money(1, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType GOAT = new TradeGoodType(
            "goat",
            "Goat",
            new Money(1, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType CINNAMON = new TradeGoodType(
            "cinnamon",
            "Cinnamon",
            new Money(2, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType PEPPER = new TradeGoodType(
            "pepper",
            "Pepper",
            new Money(2, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType SHEEP = new TradeGoodType(
            "sheep",
            "Sheep",
            new Money(2, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType CLOVES = new TradeGoodType(
            "cloves",
            "Cloves",
            new Money(3, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType PIG = new TradeGoodType(
            "pig",
            "Pig",
            new Money(3, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType SILVER = new TradeGoodType(
            "silver",
            "Silver",
            new Money(5, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType LINEN = new TradeGoodType(
            "linen",
            "Linen",
            new Money(5, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType SILK = new TradeGoodType(
            "silk",
            "Silk",
            new Money(10, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType COW = new TradeGoodType(
            "cow",
            "Cow",
            new Money(10, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType SAFFRON = new TradeGoodType(
            "saffron",
            "Saffron",
            new Money(15, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType OX = new TradeGoodType(
            "ox",
            "Ox",
            new Money(15, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType GOLD = new TradeGoodType(
            "gold",
            "Gold",
            new Money(50, GP),
            new Weight(1, LB)
    );
    public static final TradeGoodType PLATINUM = new TradeGoodType(
            "platinum",
            "Platinum",
            new Money(500, GP),
            new Weight(1, LB)
    );

    private PhbTradeGoodType() {}
}
