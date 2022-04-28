package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.ARCANA;
import static uk.co.renbinden.libdnd.skill.Skill.HISTORY;

public class Sage extends Background {
    public Sage(Language language1, Language language2) {
        super(
                "Sage",
                List.of(
                        new SkillProficiency(ARCANA),
                        new SkillProficiency(HISTORY)
                ),
                List.of(
                        language1,
                        language2
                ),
                List.of(
                        new Item<>(INK),
                        new Item<>(INK_PEN),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(10, GP)
        );
    }
}
