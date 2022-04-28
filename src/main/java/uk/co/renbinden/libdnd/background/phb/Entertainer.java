package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.MusicalInstrumentType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.COSTUME_CLOTHES;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.POUCH;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.DISGUISE_KIT;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.ACROBATICS;
import static uk.co.renbinden.libdnd.skill.Skill.PERFORMANCE;

public class Entertainer extends Background {
    public Entertainer(ToolProficiency<MusicalInstrumentType> musicalInstrumentProficiency, Item<MusicalInstrumentType> musicalInstrument) {
        super(
                "Entertainer",
                List.of(
                        new SkillProficiency(ACROBATICS),
                        new SkillProficiency(PERFORMANCE),
                        new ToolProficiency<>(DISGUISE_KIT),
                        musicalInstrumentProficiency
                ),
                emptyList(),
                List.of(
                        musicalInstrument,
                        new Item<>(COSTUME_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(15, GP)
        );
    }
}
