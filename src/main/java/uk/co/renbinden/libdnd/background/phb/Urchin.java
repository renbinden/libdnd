package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.COMMON_CLOTHES;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.POUCH;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.DISGUISE_KIT;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.THIEVES_TOOLS;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.SLEIGHT_OF_HAND;
import static uk.co.renbinden.libdnd.skill.Skill.STEALTH;

public class Urchin extends Background {
    public Urchin() {
        super(
                "Urchin",
                List.of(
                        new SkillProficiency(SLEIGHT_OF_HAND),
                        new SkillProficiency(STEALTH),
                        new ToolProficiency<>(DISGUISE_KIT),
                        new ToolProficiency<>(THIEVES_TOOLS)
                ),
                emptyList(),
                List.of(
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(10, GP)
        );
    }
}
