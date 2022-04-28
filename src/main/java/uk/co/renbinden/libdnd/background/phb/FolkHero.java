package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.ArtisansToolsType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;
import uk.co.renbinden.libdnd.proficiency.VehicleProficiency;

import java.util.List;

import static java.util.Collections.emptyList;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.*;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.proficiency.VehicleProficiency.VehicleProficiencyType.LAND;
import static uk.co.renbinden.libdnd.skill.Skill.ANIMAL_HANDLING;
import static uk.co.renbinden.libdnd.skill.Skill.SURVIVAL;

public class FolkHero extends Background {
    public FolkHero(ToolProficiency<ArtisansToolsType> toolProficiency, Item<ArtisansToolsType> tools) {
        super(
                "Folk Hero",
                List.of(
                        new SkillProficiency(ANIMAL_HANDLING),
                        new SkillProficiency(SURVIVAL),
                        toolProficiency,
                        new VehicleProficiency(LAND)
                ),
                emptyList(),
                List.of(
                        tools,
                        new Item<>(SHOVEL),
                        new Item<>(IRON_POT),
                        new Item<>(COMMON_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(10, GP)
        );
    }
}
