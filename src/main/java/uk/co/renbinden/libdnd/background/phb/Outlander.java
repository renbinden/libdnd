package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.MusicalInstrumentType;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.ATHLETICS;
import static uk.co.renbinden.libdnd.skill.Skill.SURVIVAL;

public class Outlander extends Background {
    public Outlander(ToolProficiency<MusicalInstrumentType> musicalInstrumentProficiency, Language language) {
        super(
                "Outlander",
                List.of(
                        new SkillProficiency(ATHLETICS),
                        new SkillProficiency(SURVIVAL),
                        musicalInstrumentProficiency
                ),
                List.of(language),
                List.of(
                        new Item<>(STAFF),
                        new Item<>(HUNTING_TRAP),
                        new Item<>(TRAVELERS_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(10, GP)
        );
    }
}
