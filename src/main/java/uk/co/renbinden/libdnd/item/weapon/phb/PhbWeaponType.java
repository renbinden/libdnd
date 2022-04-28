package uk.co.renbinden.libdnd.item.weapon.phb;

import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.item.weapon.*;
import uk.co.renbinden.libdnd.item.weapon.property.WeaponProperty;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.roll.Roll;
import uk.co.renbinden.libdnd.roll.Roll.Die;
import uk.co.renbinden.libdnd.roll.Roll.Modifier;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.damage.DamageType.*;
import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;
import static uk.co.renbinden.libdnd.money.Currency.*;
import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public final class PhbWeaponType {

    public static final SimpleMeleeWeaponType CLUB = new SimpleMeleeWeaponType(
            "club",
            "Club",
            new Money(1, SP),
            new WeaponDamage(new Roll(new Die(4)), BLUDGEONING),
            new Weight(2, LB),
            new WeaponProperty.Light()
    );
    public static final SimpleMeleeWeaponType DAGGER = new SimpleMeleeWeaponType(
            "dagger",
            "Dagger",
            new Money(2, GP),
            new WeaponDamage(new Roll(new Die(4)), PIERCING),
            new Weight(1, LB),
            new WeaponProperty.Finesse(),
            new WeaponProperty.Light(),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(20, FEET), new Distance(60, FEET))
    );
    public static final SimpleMeleeWeaponType GREATCLUB = new SimpleMeleeWeaponType(
            "greatclub",
            "Greatclub",
            new Money(2, SP),
            new WeaponDamage(new Roll(new Die(8)), BLUDGEONING),
            new Weight(10, LB),
            new WeaponProperty.TwoHanded()
    );
    public static final SimpleMeleeWeaponType HANDAXE = new SimpleMeleeWeaponType(
            "handaxe",
            "Handaxe",
            new Money(5, GP),
            new WeaponDamage(new Roll(new Die(6)), SLASHING),
            new Weight(2, LB),
            new WeaponProperty.Light(),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(20, FEET), new Distance(60, FEET))
    );
    public static final SimpleMeleeWeaponType JAVELIN = new SimpleMeleeWeaponType(
            "javelin",
            "Javelin",
            new Money(5, SP),
            new WeaponDamage(new Roll(new Die(6)), PIERCING),
            new Weight(2, LB),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(30, FEET), new Distance(120, FEET))
    );
    public static final SimpleMeleeWeaponType LIGHT_HAMMER = new SimpleMeleeWeaponType(
            "light_hammer",
            "Light hammer",
            new Money(2, GP),
            new WeaponDamage(new Roll(new Die(4)), BLUDGEONING),
            new Weight(2, LB),
            new WeaponProperty.Light(),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(30, FEET), new Distance(120, FEET))
    );
    public static final SimpleMeleeWeaponType MACE = new SimpleMeleeWeaponType(
            "mace",
            "Mace",
            new Money(5, GP),
            new WeaponDamage(new Roll(new Die(6)), BLUDGEONING),
            new Weight(4, LB)
    );
    public static final SimpleMeleeWeaponType QUARTERSTAFF = new SimpleMeleeWeaponType(
            "quarterstaff",
            "Quarterstaff",
            new Money(2, SP),
            new WeaponDamage(new Roll(new Die(6)), BLUDGEONING),
            new Weight(4, LB),
            new WeaponProperty.Versatile(new Roll(new Die(8)))
    );
    public static final SimpleMeleeWeaponType SICKLE = new SimpleMeleeWeaponType(
            "sickle",
            "Sickle",
            new Money(1, GP),
            new WeaponDamage(new Roll(new Die(4)), SLASHING),
            new Weight(2, LB),
            new WeaponProperty.Light()
    );
    public static final SimpleMeleeWeaponType SPEAR = new SimpleMeleeWeaponType(
            "spear",
            "Spear",
            new Money(1, GP),
            new WeaponDamage(new Roll(new Die(6)), PIERCING),
            new Weight(3, LB),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(20, FEET), new Distance(60, FEET)),
            new WeaponProperty.Versatile(new Roll(new Die(8)))
    );
    public static final SimpleRangedWeaponType LIGHT_CROSSBOW = new SimpleRangedWeaponType(
            "light_crossbow",
            "Crossbow, light",
            new Money(25, GP),
            new WeaponDamage(new Roll(new Die(8)), PIERCING),
            new Weight(5, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(80, FEET), new Distance(320, FEET)),
            new WeaponProperty.Loading(),
            new WeaponProperty.TwoHanded()
    );
    public static final SimpleRangedWeaponType DART = new SimpleRangedWeaponType(
            "dart",
            "Dart",
            new Money(5, CP),
            new WeaponDamage(new Roll(new Die(4)), PIERCING),
            new Weight(0.25, LB),
            new WeaponProperty.Finesse(),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(20, FEET), new Distance(60, FEET))
    );
    public static final SimpleRangedWeaponType SHORTBOW = new SimpleRangedWeaponType(
            "shortbow",
            "Shortbow",
            new Money(25, GP),
            new WeaponDamage(new Roll(new Die(6)), PIERCING),
            new Weight(2, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(80, FEET), new Distance(320, FEET)),
            new WeaponProperty.TwoHanded()
    );
    public static final SimpleRangedWeaponType SLING = new SimpleRangedWeaponType(
            "sling",
            "Sling",
            new Money(1, SP),
            new WeaponDamage(new Roll(new Die(4)), BLUDGEONING),
            new Weight(0, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(30, FEET), new Distance(120, FEET))
    );
    public static final MartialMeleeWeaponType BATTLEAXE = new MartialMeleeWeaponType(
            "battleaxe",
            "Battleaxe",
            new Money(10, GP),
            new WeaponDamage(new Roll(new Die(8)), SLASHING),
            new Weight(4, LB),
            new WeaponProperty.Versatile(new Roll(new Die(10)))
    );
    public static final MartialMeleeWeaponType FLAIL = new MartialMeleeWeaponType(
            "flail",
            "Flail",
            new Money(10, GP),
            new WeaponDamage(new Roll(new Die(8)), BLUDGEONING),
            new Weight(2, LB)
    );
    public static final MartialMeleeWeaponType GLAIVE = new MartialMeleeWeaponType(
            "glaive",
            "Glaive",
            new Money(20, GP),
            new WeaponDamage(new Roll(new Die(10)), SLASHING),
            new Weight(6, LB),
            new WeaponProperty.Heavy(),
            new WeaponProperty.Reach(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialMeleeWeaponType GREATAXE = new MartialMeleeWeaponType(
            "greataxe",
            "Greataxe",
            new Money(30, GP),
            new WeaponDamage(new Roll(new Die(12)), SLASHING),
            new Weight(7, LB),
            new WeaponProperty.Heavy(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialMeleeWeaponType GREATSWORD = new MartialMeleeWeaponType(
            "greatsword",
            "Greatsword",
            new Money(50, GP),
            new WeaponDamage(new Roll(new Die(2, 6)), SLASHING),
            new Weight(6, LB),
            new WeaponProperty.Heavy(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialMeleeWeaponType HALBERD = new MartialMeleeWeaponType(
            "halberd",
            "Halberd",
            new Money(20, GP),
            new WeaponDamage(new Roll(new Die(10)), SLASHING),
            new Weight(6, LB),
            new WeaponProperty.Heavy(),
            new WeaponProperty.Reach(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialMeleeWeaponType LANCE = new MartialMeleeWeaponType(
            "lance",
            "Lance",
            new Money(10, GP),
            new WeaponDamage(new Roll(new Die(12)), PIERCING),
            new Weight(6, LB),
            new WeaponProperty.Reach(),
            new WeaponProperty.Special(
                    "You have disadvantage when you use a lance to attack a target within 5 feet of you. " +
                            "Also, a lance requires two hands to wield when you aren't mounted. "
            )
    );
    public static final MartialMeleeWeaponType LONGSWORD = new MartialMeleeWeaponType(
            "longsword",
            "Longsword",
            new Money(15, GP),
            new WeaponDamage(new Roll(new Die(8)), SLASHING),
            new Weight(3, LB),
            new WeaponProperty.Versatile(new Roll(new Die(10)))
    );
    public static final MartialMeleeWeaponType MAUL = new MartialMeleeWeaponType(
            "maul",
            "Maul",
            new Money(10, GP),
            new WeaponDamage(new Roll(new Die(2, 6)), BLUDGEONING),
            new Weight(10, LB),
            new WeaponProperty.Heavy(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialMeleeWeaponType MORNINGSTAR = new MartialMeleeWeaponType(
            "morningstar",
            "Morningstar",
            new Money(15, GP),
            new WeaponDamage(new Roll(new Die(8)), PIERCING),
            new Weight(4, LB)
    );
    public static final MartialMeleeWeaponType PIKE = new MartialMeleeWeaponType(
            "pike",
            "Pike",
            new Money(5, GP),
            new WeaponDamage(new Roll(new Die(10)), PIERCING),
            new Weight(18, LB),
            new WeaponProperty.Heavy(),
            new WeaponProperty.Reach(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialMeleeWeaponType RAPIER = new MartialMeleeWeaponType(
            "rapier",
            "Rapier",
            new Money(25, GP),
            new WeaponDamage(new Roll(new Die(8)), PIERCING),
            new Weight(2, LB),
            new WeaponProperty.Finesse()
    );
    public static final MartialMeleeWeaponType SCIMITAR = new MartialMeleeWeaponType(
            "scimitar",
            "Scimitar",
            new Money(25, GP),
            new WeaponDamage(new Roll(new Die(6)), SLASHING),
            new Weight(3, LB),
            new WeaponProperty.Light(),
            new WeaponProperty.Finesse()
    );
    public static final MartialMeleeWeaponType SHORTSWORD = new MartialMeleeWeaponType(
            "shortsword",
            "Shortsword",
            new Money(10, GP),
            new WeaponDamage(new Roll(new Die(6)), PIERCING),
            new Weight(2, LB),
            new WeaponProperty.Finesse(),
            new WeaponProperty.Light()
    );
    public static final MartialMeleeWeaponType TRIDENT = new MartialMeleeWeaponType(
            "trident",
            "Trident",
            new Money(5, GP),
            new WeaponDamage(new Roll(new Die(6)), PIERCING),
            new Weight(4, LB),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(20, FEET), new Distance(60, FEET)),
            new WeaponProperty.Versatile(new Roll(new Die(8)))
    );
    public static final MartialMeleeWeaponType WAR_PICK = new MartialMeleeWeaponType(
            "war_pick",
            "War pick",
            new Money(5, GP),
            new WeaponDamage(new Roll(new Die(8)), PIERCING),
            new Weight(2, LB)
    );
    public static final MartialMeleeWeaponType WARHAMMER = new MartialMeleeWeaponType(
            "warhammer",
            "Warhammer",
            new Money(15, GP),
            new WeaponDamage(new Roll(new Die(8)), BLUDGEONING),
            new Weight(2, LB),
            new WeaponProperty.Versatile(new Roll(new Die(10)))
    );
    public static final MartialMeleeWeaponType WHIP = new MartialMeleeWeaponType(
            "whip",
            "Whip",
            new Money(2, GP),
            new WeaponDamage(new Roll(new Die(4)), SLASHING),
            new Weight(3, LB),
            new WeaponProperty.Finesse(),
            new WeaponProperty.Reach()
    );
    public static final MartialRangedWeaponType BLOWGUN = new MartialRangedWeaponType(
            "blowgun",
            "Blowgun",
            new Money(10, GP),
            new WeaponDamage(new Roll(new Modifier(1)), PIERCING),
            new Weight(1, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(25, FEET), new Distance(100, FEET)),
            new WeaponProperty.Loading()
    );
    public static final MartialRangedWeaponType HAND_CROSSBOW = new MartialRangedWeaponType(
            "hand_crossbow",
            "Crossbow, hand",
            new Money(75, GP),
            new WeaponDamage(new Roll(new Die(6)), PIERCING),
            new Weight(3, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(30, FEET), new Distance(120, FEET)),
            new WeaponProperty.Light(),
            new WeaponProperty.Loading()
    );
    public static final MartialRangedWeaponType HEAVY_CROSSBOW = new MartialRangedWeaponType(
            "heavy_crossbow",
            "Crossbow, heavy",
            new Money(50, GP),
            new WeaponDamage(new Roll(new Die(10)), PIERCING),
            new Weight(18, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(100, FEET), new Distance(400, FEET)),
            new WeaponProperty.Heavy(),
            new WeaponProperty.Loading(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialRangedWeaponType LONGBOW = new MartialRangedWeaponType(
            "longbow",
            "Longbow",
            new Money(50, GP),
            new WeaponDamage(new Roll(new Die(8)), PIERCING),
            new Weight(2, LB),
            new WeaponProperty.Ammunition(),
            new WeaponProperty.Range(new Distance(150, FEET), new Distance(600, FEET)),
            new WeaponProperty.Heavy(),
            new WeaponProperty.TwoHanded()
    );
    public static final MartialRangedWeaponType NET = new MartialRangedWeaponType(
            "net",
            "Net",
            new Money(1, GP),
            null,
            new Weight(3, LB),
            new WeaponProperty.Special(
                    "A Large or smaller creature hit by a net is restrained until it is freed. A net has " +
                            "no effect on creatures that are formless, or creatures that are Huge or larger. A " +
                            "creature can use its action to make a DC 10 Strength check, freeing itself or another " +
                            "creature within its reach on a success. Dealing 5 slashing damage to the net (AC 10) " +
                            "also frees the creature without harming it, ending the effect and destroying the net. " +
                            "When you use an action, bonus action, or reaction to attack with a net, you can only " +
                            "make one attack regardless of the number of attacks you can normally make."
            ),
            new WeaponProperty.Thrown(),
            new WeaponProperty.Range(new Distance(5, FEET), new Distance(15, FEET))
    );

    private PhbWeaponType() {}
}
