package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class DungeoneersPack extends EquipmentPack {
    public DungeoneersPack() {
        super(
                "Dungeoneer's Pack",
                new Money(12, GP),
                List.of(
                        new Item<>(BACKPACK),
                        new Item<>(CROWBAR),
                        new Item<>(HAMMER),
                        new Item<>(PITON, 10),
                        new Item<>(TORCH, 10),
                        new Item<>(TINDERBOX),
                        new Item<>(RATIONS, 10),
                        new Item<>(WATERSKIN),
                        new Item<>(HEMPEN_ROPE)
                )
        );
    }
}
