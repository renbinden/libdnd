package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class PriestsPack extends EquipmentPack {
    public PriestsPack() {
        super(
                "Priest's Pack",
                new Money(19, GP),
                List.of(
                        new Item<>(BACKPACK),
                        new Item<>(BLANKET),
                        new Item<>(CANDLE, 10),
                        new Item<>(TINDERBOX),
                        new Item<>(FINE_CLOTHES),
                        new Item<>(RATIONS, 2),
                        new Item<>(WATERSKIN)
                )
        );
    }
}
