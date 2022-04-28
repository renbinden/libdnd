package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.BLANKET;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.COMMON_CLOTHES;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.HERBALISM_KIT;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.MEDICINE;
import static uk.co.renbinden.libdnd.skill.Skill.RELIGION;

public class Hermit extends Background {
    public Hermit(Language language) {
        super(
                "Hermit",
                List.of(
                        new SkillProficiency(MEDICINE),
                        new SkillProficiency(RELIGION),
                        new ToolProficiency<>(HERBALISM_KIT)
                ),
                List.of(
                        language
                ),
                List.of(
                        new Item<>(BLANKET),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(HERBALISM_KIT)
                ),
                new Money(5, GP)
        );
    }
}
