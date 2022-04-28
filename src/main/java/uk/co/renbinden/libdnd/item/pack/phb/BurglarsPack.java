package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class BurglarsPack extends EquipmentPack {
    public BurglarsPack() {
        super(
                "Burglar's Pack",
                new Money(16, GP),
                List.of(
                        new Item<>(BACKPACK),
                        new Item<>(BALL_BEARINGS),
                        new Item<>(BELL),
                        new Item<>(CANDLE, 5),
                        new Item<>(CROWBAR),
                        new Item<>(HAMMER),
                        new Item<>(PITON, 10),
                        new Item<>(HOODED_LANTERN),
                        new Item<>(OIL, 2),
                        new Item<>(RATIONS, 5),
                        new Item<>(TINDERBOX),
                        new Item<>(WATERSKIN),
                        new Item<>(HEMPEN_ROPE)
                )
        );
    }
}
