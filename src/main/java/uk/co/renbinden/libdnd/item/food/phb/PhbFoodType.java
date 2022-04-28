package uk.co.renbinden.libdnd.item.food.phb;

import uk.co.renbinden.libdnd.item.food.FoodType;
import uk.co.renbinden.libdnd.money.Money;

import static uk.co.renbinden.libdnd.money.Currency.*;

public final class PhbFoodType {
    public static final FoodType ALE_GALLON = new FoodType(
            "ale_gallon",
            "Ale (gallon)",
            new Money(4, CP)
    );
    public static final FoodType ALE_MUG = new FoodType(
            "ale_mug",
            "Ale (mug)",
            new Money(4, CP)
    );
    public static final FoodType BANQUET = new FoodType(
            "banquet",
            "Banquet",
            new Money(10, GP)
    );
    public static final FoodType BREAD_LOAF = new FoodType(
            "bread_loaf",
            "Bread, loaf",
            new Money(2, CP)
    );
    public static final FoodType CHEESE_HUNK = new FoodType(
            "cheese_hunk",
            "Cheese, hunk",
            new Money(1, SP)
    );
    public static final FoodType SQUALID_MEAL = new FoodType(
            "squalid_meal",
            "Squalid meal",
            new Money(3, CP)
    );
    public static final FoodType POOR_MEAL = new FoodType(
            "poor_meal",
            "Poor meal",
            new Money(6, CP)
    );
    public static final FoodType MODEST_MEAL = new FoodType(
            "modest_meal",
            "Modest meal",
            new Money(3, SP)
    );
    public static final FoodType COMFORTABLE_MEAL = new FoodType(
            "comfortable_meal",
            "Comfortable meal",
            new Money(5, SP)
    );
    public static final FoodType WEALTHY_MEAL = new FoodType(
            "wealthy_meal",
            "Wealthy meal",
            new Money(8, SP)
    );
    public static final FoodType ARISTOCRATIC_MEAL = new FoodType(
            "aristocratic_meal",
            "Aristocratic meal",
            new Money(2, GP)
    );
    public static final FoodType MEAT_CHUNK = new FoodType(
            "meat_chunk",
            "Meat chunk",
            new Money(3, SP)
    );
    public static final FoodType COMMON_WINE = new FoodType(
            "common_wine",
            "Wine, common (pitcher)",
            new Money(2, SP)
    );
    public static final FoodType FINE_WINE = new FoodType(
            "fine_wine",
            "Wine, fine (bottle)",
            new Money(10, GP)
    );

    private PhbFoodType() {}
}
