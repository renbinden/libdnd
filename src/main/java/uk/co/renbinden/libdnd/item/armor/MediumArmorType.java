package uk.co.renbinden.libdnd.item.armor;

import uk.co.renbinden.libdnd.ability.StrengthRequirement;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import java.time.Duration;

public class MediumArmorType extends ArmorType {
    public MediumArmorType(
            String identifier,
            String name,
            Money cost,
            ArmorClassCalculation armorClass,
            StrengthRequirement strengthRequirement,
            boolean disadvantageToStealthChecks,
            Weight weight,
            boolean isMetal
    ) {
        super(
                identifier,
                name,
                cost,
                armorClass,
                strengthRequirement,
                disadvantageToStealthChecks,
                weight,
                isMetal,
                Duration.ofMinutes(5L),
                Duration.ofMinutes(1L)
        );
    }
}
