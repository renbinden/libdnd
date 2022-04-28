package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class ExplorersPack extends EquipmentPack {
    public ExplorersPack() {
        super(
                "Explorer's Pack",
                new Money(10, GP),
                List.of(
                        new Item<>(BACKPACK),
                        new Item<>(BEDROLL),
                        new Item<>(MESS_KIT),
                        new Item<>(TINDERBOX),
                        new Item<>(TORCH, 10),
                        new Item<>(RATIONS, 10),
                        new Item<>(WATERSKIN),
                        new Item<>(HEMPEN_ROPE)
                )
        );
    }
}
