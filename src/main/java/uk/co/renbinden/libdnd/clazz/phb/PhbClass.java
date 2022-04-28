package uk.co.renbinden.libdnd.clazz.phb;

import uk.co.renbinden.libdnd.clazz.Clazz;
import uk.co.renbinden.libdnd.clazz.MulticlassingRequirement;
import uk.co.renbinden.libdnd.roll.Roll;
import uk.co.renbinden.libdnd.roll.Roll.Die;

import static uk.co.renbinden.libdnd.ability.Ability.*;

public final class PhbClass {

    public static final Clazz BARBARIAN = new Clazz(
            "Barbarian",
            new Roll(new Die(12)),
            STRENGTH,
            12,
            7,
            new MulticlassingRequirement.AbilityRequirement(STRENGTH, 13)
    );
    public static final Clazz BARD = new Clazz(
            "Bard",
            new Roll(new Die(8)),
            CHARISMA,
            8,
            5,
            new MulticlassingRequirement.AbilityRequirement(CHARISMA, 13)
    );
    public static final Clazz CLERIC = new Clazz(
            "Cleric",
            new Roll(new Die(8)),
            WISDOM,
            8,
            5,
            new MulticlassingRequirement.AbilityRequirement(WISDOM, 13)
    );
    public static final Clazz DRUID = new Clazz(
            "Druid",
            new Roll(new Die(8)),
            WISDOM,
            8,
            5,
            new MulticlassingRequirement.AbilityRequirement(WISDOM, 13)
    );
    public static final Clazz FIGHTER = new Clazz(
            "Fighter",
            new Roll(new Die(10)),
            STRENGTH, // or DEXTERITY
            10,
            6,
            new MulticlassingRequirement.AnyRequirement(
                    new MulticlassingRequirement.AbilityRequirement(STRENGTH, 13),
                    new MulticlassingRequirement.AbilityRequirement(DEXTERITY, 13)
            )
    );
    public static final Clazz MONK = new Clazz(
            "Monk",
            new Roll(new Die(8)),
            DEXTERITY,
            8,
            5,
            new MulticlassingRequirement.AllRequirement(
                    new MulticlassingRequirement.AbilityRequirement(DEXTERITY, 13),
                    new MulticlassingRequirement.AbilityRequirement(WISDOM, 13)
            )
    );
    public static final Clazz PALADIN = new Clazz(
            "Paladin",
            new Roll(new Die(10)),
            STRENGTH,
            10,
            6,
            new MulticlassingRequirement.AllRequirement(
                    new MulticlassingRequirement.AbilityRequirement(STRENGTH, 13),
                    new MulticlassingRequirement.AbilityRequirement(CHARISMA, 13)
            )
    );
    public static final Clazz RANGER = new Clazz(
            "Ranger",
            new Roll(new Die(10)),
            DEXTERITY, // and WISDOM
            10,
            6,
            new MulticlassingRequirement.AllRequirement(
                    new MulticlassingRequirement.AbilityRequirement(DEXTERITY, 13),
                    new MulticlassingRequirement.AbilityRequirement(WISDOM, 13)
            )
    );
    public static final Clazz ROGUE = new Clazz(
            "Rogue",
            new Roll(new Die(8)),
            DEXTERITY,
            8,
            5,
            new MulticlassingRequirement.AbilityRequirement(DEXTERITY, 13)
    );
    public static final Clazz SORCERER = new Clazz(
            "Sorcerer",
            new Roll(new Die(6)),
            CHARISMA,
            6,
            4,
            new MulticlassingRequirement.AbilityRequirement(CHARISMA, 13)
    );
    public static final Clazz WARLOCK = new Clazz(
            "Warlock",
            new Roll(new Die(8)),
            CHARISMA,
            8,
            5,
            new MulticlassingRequirement.AbilityRequirement(CHARISMA, 13)
    );
    public static final Clazz WIZARD = new Clazz(
            "Wizard",
            new Roll(new Die(6)),
            INTELLIGENCE,
            6,
            4,
            new MulticlassingRequirement.AbilityRequirement(INTELLIGENCE, 13)
    );

    private PhbClass() {}
}
