package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.GamingSetType;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.HISTORY;
import static uk.co.renbinden.libdnd.skill.Skill.PERSUASION;

public class Noble extends Background {
    public Noble(ToolProficiency<GamingSetType> gameProficiency, Language language) {
        super(
                "Noble",
                List.of(
                        new SkillProficiency(HISTORY),
                        new SkillProficiency(PERSUASION),
                        gameProficiency
                ),
                List.of(language),
                List.of(
                        new Item<>(FINE_CLOTHES),
                        new Item<>(SIGNET_RING),
                        new Item<>(POUCH)
                ),
                new Money(25, GP)
        );
    }
}
