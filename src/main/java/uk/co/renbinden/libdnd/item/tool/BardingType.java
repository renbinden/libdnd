package uk.co.renbinden.libdnd.item.tool;

import uk.co.renbinden.libdnd.ability.StrengthRequirement;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import java.time.Duration;

public abstract class BardingType extends ToolType {
    private final ArmorClassCalculation armorClass;
    private final StrengthRequirement strengthRequirement;
    private final boolean disadvantageToStealthChecks;
    private final boolean isMetal;
    private final Duration donTime;
    private final Duration doffTime;
    public BardingType(
            String identifier,
            String name,
            Money cost,
            Weight weight,
            ArmorClassCalculation armorClass,
            boolean disadvantageToStealthChecks,
            StrengthRequirement strengthRequirement,
            boolean isMetal,
            Duration donTime,
            Duration doffTime
    ) {
        super(identifier, name, cost, weight);
        this.armorClass = armorClass;
        this.strengthRequirement = strengthRequirement;
        this.disadvantageToStealthChecks = disadvantageToStealthChecks;
        this.isMetal = isMetal;
        this.donTime = donTime;
        this.doffTime = doffTime;
    }

    public ArmorClassCalculation getArmorClass() {
        return armorClass;
    }

    public StrengthRequirement getStrengthRequirement() {
        return strengthRequirement;
    }

    public boolean isDisadvantageToStealthChecks() {
        return disadvantageToStealthChecks;
    }

    public boolean isMetal() {
        return isMetal;
    }

    public Duration getDonTime() {
        return donTime;
    }

    public Duration getDoffTime() {
        return doffTime;
    }
}
