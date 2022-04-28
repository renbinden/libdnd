package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.FINE_CLOTHES;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.POUCH;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.DISGUISE_KIT;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.FORGERY_KIT;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.DECEPTION;
import static uk.co.renbinden.libdnd.skill.Skill.SLEIGHT_OF_HAND;

public class Charlatan extends Background {
    public Charlatan() {
        super(
                "Charlatan",
                List.of(
                        new SkillProficiency(DECEPTION),
                        new SkillProficiency(SLEIGHT_OF_HAND),
                        new ToolProficiency<>(DISGUISE_KIT),
                        new ToolProficiency<>(FORGERY_KIT)
                ),
                emptyList(),
                List.of(
                        new Item<>(FINE_CLOTHES),
                        new Item<>(DISGUISE_KIT),
                        new Item<>(POUCH)
                ),
                new Money(15, GP)
        );
    }
}
