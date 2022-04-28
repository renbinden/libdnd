package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class ScolarsPack extends EquipmentPack {
    public ScolarsPack() {
        super(
                "Scholar's Pack",
                new Money(40, GP),
                List.of(
                        new Item<>(BACKPACK),
                        new Item<>(BOOK),
                        new Item<>(INK),
                        new Item<>(INK_PEN),
                        new Item<>(PARCHMENT, 10)
                )
        );
    }
}
