package uk.co.renbinden.libdnd.item.tool;

import uk.co.renbinden.libdnd.ability.StrengthRequirement;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import java.time.Duration;

public class MediumBardingType extends BardingType {
    public MediumBardingType(
            String identifier,
            String name,
            Money cost,
            Weight weight,
            ArmorClassCalculation armorClass,
            boolean disadvantageToStealthChecks,
            StrengthRequirement strengthRequirement,
            boolean isMetal
    ) {
        super(
                identifier,
                name,
                cost,
                weight,
                armorClass,
                disadvantageToStealthChecks,
                strengthRequirement,
                isMetal,
                Duration.ofMinutes(10L),
                Duration.ofMinutes(5L)
        );
    }
}
