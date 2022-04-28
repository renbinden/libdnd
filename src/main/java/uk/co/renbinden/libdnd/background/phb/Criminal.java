package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.GamingSetType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.THIEVES_TOOLS;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.DECEPTION;
import static uk.co.renbinden.libdnd.skill.Skill.STEALTH;

public class Criminal extends Background {
    public Criminal(ToolProficiency<GamingSetType> gamingSetProficiency) {
        super(
                "Criminal",
                List.of(
                        new SkillProficiency(DECEPTION),
                        new SkillProficiency(STEALTH),
                       gamingSetProficiency,
                        new ToolProficiency<>(THIEVES_TOOLS)
                ),
                emptyList(),
                List.of(
                        new Item<>(CROWBAR),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(15, GP)
        );
    }
}
