package uk.co.renbinden.libdnd.item.pack.phb;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.pack.EquipmentPack;
import uk.co.renbinden.libdnd.money.Money;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.DISGUISE_KIT;
import static uk.co.renbinden.libdnd.money.Currency.GP;

public final class EntertainersPack extends EquipmentPack {
    public EntertainersPack() {
        super(
                "Entertainer's Pack",
                new Money(40, GP),
                List.of(
                        new Item<>(BACKPACK),
                        new Item<>(BEDROLL),
                        new Item<>(COSTUME_CLOTHES, 2),
                        new Item<>(CANDLE, 5),
                        new Item<>(RATIONS, 5),
                        new Item<>(WATERSKIN),
                        new Item<>(DISGUISE_KIT)
                )
        );
    }
}
