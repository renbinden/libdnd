package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.INSIGHT;
import static uk.co.renbinden.libdnd.skill.Skill.RELIGION;

public class Acolyte extends Background {
    public Acolyte(Language language1, Language language2) {
        super(
                "Acolyte",
                List.of(
                        new SkillProficiency(INSIGHT),
                        new SkillProficiency(RELIGION)
                ),
                List.of(
                        language1,
                        language2
                ),
                List.of(
                        new Item<>(AMULET),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(15, GP)
        );
    }
}
