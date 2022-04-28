package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.GamingSetType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;
import uk.co.renbinden.libdnd.proficiency.VehicleProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.COMMON_CLOTHES;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.POUCH;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.DICE_SET;
import static uk.co.renbinden.libdnd.item.tool.phb.PhbToolType.PLAYING_CARD_SET;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.proficiency.VehicleProficiency.VehicleProficiencyType.LAND;
import static uk.co.renbinden.libdnd.skill.Skill.ATHLETICS;
import static uk.co.renbinden.libdnd.skill.Skill.INTIMIDATION;

public class Soldier extends Background {
    public Soldier(ToolProficiency<GamingSetType> gameProficiency) {
        super(
                "Soldier",
                List.of(
                        new SkillProficiency(ATHLETICS),
                        new SkillProficiency(INTIMIDATION),
                        gameProficiency,
                        new VehicleProficiency(LAND)
                ),
                emptyList(),
                List.of(
                        new Item<>(DICE_SET),
                        new Item<>(PLAYING_CARD_SET),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(10, GP)
        );
    }
}
