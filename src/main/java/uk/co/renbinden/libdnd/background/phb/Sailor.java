package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;
import uk.co.renbinden.libdnd.proficiency.VehicleProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.NAVIGATORS_TOOLS;
import static uk.co.renbinden.libdnd.item.weapon.phb.PhbWeaponType.CLUB;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.proficiency.VehicleProficiency.VehicleProficiencyType.WATER;
import static uk.co.renbinden.libdnd.skill.Skill.ATHLETICS;
import static uk.co.renbinden.libdnd.skill.Skill.PERCEPTION;

public class Sailor extends Background {
    public Sailor() {
        super(
                "Sailor",
                List.of(
                        new SkillProficiency(ATHLETICS),
                        new SkillProficiency(PERCEPTION),
                        new ToolProficiency<>(NAVIGATORS_TOOLS),
                        new VehicleProficiency(WATER)
                ),
                emptyList(),
                List.of(
                        new Item<>(CLUB),
                        new Item<>(SILK_ROPE),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(10, GP)
        );
    }
}
