package uk.co.renbinden.libdnd.item.armor.phb;

import uk.co.renbinden.libdnd.ability.StrengthRequirement;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation;
import uk.co.renbinden.libdnd.item.armor.*;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.ability.Ability.DEXTERITY;
import static uk.co.renbinden.libdnd.money.Currency.GP;
import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public final class PhbArmorType {
    public static final LightArmorType PADDED_ARMOR = new LightArmorType(
            "padded_armor",
            "Padded armor",
            new Money(5, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(11),
                    new ArmorClassCalculation.AbilityModifierArmorClassComponent(DEXTERITY)
            ),
            new StrengthRequirement(0),
            true,
            new Weight(8, LB),
            false
    );
    public static final LightArmorType LEATHER_ARMOR = new LightArmorType(
            "leather_armor",
            "Leather armor",
            new Money(10, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(11),
                    new ArmorClassCalculation.AbilityModifierArmorClassComponent(DEXTERITY)
            ),
            new StrengthRequirement(0),
            false,
            new Weight(10, LB),
            false
    );
    public static final LightArmorType STUDDED_LEATHER_ARMOR = new LightArmorType(
            "studded_leather_armor",
            "Studded leather armor",
            new Money(45, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(12),
                    new ArmorClassCalculation.AbilityModifierArmorClassComponent(DEXTERITY)
            ),
            new StrengthRequirement(0),
            false,
            new Weight(13, LB),
            false
    );
    public static final MediumArmorType HIDE_ARMOR = new MediumArmorType(
            "hide_armor",
            "Hide armor",
            new Money(10, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(12),
                    new ArmorClassCalculation.CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            new StrengthRequirement(0),
            false,
            new Weight(12, LB),
            false
    );
    public static final MediumArmorType CHAIN_SHIRT_ARMOR = new MediumArmorType(
            "chain_shirt_armor",
            "Chain shirt armor",
            new Money(50, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(13),
                    new ArmorClassCalculation.CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            new StrengthRequirement(0),
            false,
            new Weight(20, LB),
            true
    );
    public static final MediumArmorType SCALE_MAIL_ARMOR = new MediumArmorType(
            "scale_mail_armor",
            "Scale mail armor",
            new Money(50, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(14),
                    new ArmorClassCalculation.CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            new StrengthRequirement(0),
            true,
            new Weight(45, LB),
            true
    );
    public static final MediumArmorType BREASTPLATE_ARMOR = new MediumArmorType(
            "breastplate_armor",
            "Breastplate armor",
            new Money(400, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(14),
                    new ArmorClassCalculation.CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            new StrengthRequirement(0),
            false,
            new Weight(20, LB),
            true
    );
    public static final MediumArmorType HALF_PLATE_ARMOR = new MediumArmorType(
            "half_plate_armor",
            "Half plate armor",
            new Money(750, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(15),
                    new ArmorClassCalculation.CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            new StrengthRequirement(0),
            true,
            new Weight(40, LB),
            true
    );
    public static final HeavyArmorType RING_MAIL_ARMOR = new HeavyArmorType(
            "ring_mail_armor",
            "Ring mail armor",
            new Money(30, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(14)
            ),
            new StrengthRequirement(0),
            true,
            new Weight(40, LB),
            true
    );
    public static final HeavyArmorType CHAIN_MAIL_ARMOR = new HeavyArmorType(
            "chain_mail_armor",
            "Chain mail armor",
            new Money(75, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(16)
            ),
            new StrengthRequirement(13),
            true,
            new Weight(55, LB),
            true
    );
    public static final HeavyArmorType SPLINT_ARMOR = new HeavyArmorType(
            "splint_armor",
            "Splint armor",
            new Money(200, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(17)
            ),
            new StrengthRequirement(15),
            true,
            new Weight(60, LB),
            true
    );
    public static final HeavyArmorType PLATE_ARMOR = new HeavyArmorType(
            "plate_armor",
            "Plate armor",
            new Money(1500, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(18)
            ),
            new StrengthRequirement(15),
            true,
            new Weight(65, LB),
            true
    );
    public static final ShieldType SHIELD = new ShieldType(
            "shield",
            "Shield",
            new Money(10, GP),
            new ArmorClassCalculation(
                    new ArmorClassCalculation.BaseArmorClassComponent(2)
            ),
            new StrengthRequirement(0),
            false,
            new Weight(6, LB),
            false
    );
    
    
    private PhbArmorType() {}
}
