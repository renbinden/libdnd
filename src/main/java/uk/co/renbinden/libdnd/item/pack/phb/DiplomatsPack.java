package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class DiplomatsPack extends EquipmentPack {
    public DiplomatsPack() {
        super(
                "Diplomat's Pack",
                new Money(39, GP),
                List.of(
                        new Item<>(CHEST),
                        new Item<>(MAP_OR_SCROLL_CASE, 2),
                        new Item<>(FINE_CLOTHES),
                        new Item<>(INK),
                        new Item<>(INK_PEN),
                        new Item<>(LAMP),
                        new Item<>(OIL, 2),
                        new Item<>(PAPER, 5),
                        new Item<>(PERFUME),
                        new Item<>(SEALING_WAX),
                        new Item<>(SOAP)
                )
        );
    }
}
