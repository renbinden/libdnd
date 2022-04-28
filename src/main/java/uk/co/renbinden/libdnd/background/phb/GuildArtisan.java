package uk.co.renbinden.libdnd.background.phb;

import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.tool.ArtisansToolsType;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.SkillProficiency;
import uk.co.renbinden.libdnd.proficiency.ToolProficiency;

import java.util.List;

import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.POUCH;
import static uk.co.renbinden.libdnd.item.adventuringgear.phb.PhbAdventuringGearType.TRAVELERS_CLOTHES;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.skill.Skill.INSIGHT;
import static uk.co.renbinden.libdnd.skill.Skill.PERSUASION;

public class GuildArtisan extends Background {
    public GuildArtisan(ToolProficiency<ArtisansToolsType> toolProficiency, Language language, Item<ArtisansToolsType> tools) {
        super(
                "Guild Artisan",
                List.of(
                        new SkillProficiency(INSIGHT),
                        new SkillProficiency(PERSUASION),
                        toolProficiency
                ),
                List.of(language),
                List.of(
                        tools,
                        new Item<>(TRAVELERS_CLOTHES),
                        new Item<>(POUCH)
                ),
                new Money(15, GP)
        );
    }
}
