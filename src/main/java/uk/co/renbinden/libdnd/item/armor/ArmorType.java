package uk.co.renbinden.libdnd.item.armor;

import uk.co.renbinden.libdnd.ability.StrengthRequirement;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation;
import uk.co.renbinden.libdnd.item.ItemType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import java.time.Duration;

public abstract class ArmorType implements ItemType  {

    private final String identifier;
    private final String name;
    private final Money cost;
    private final ArmorClassCalculation armorClass;
    private final StrengthRequirement strengthRequirement;
    private final boolean disadvantageToStealthChecks;
    private final Weight weight;
    private final boolean isMetal;
    private final Duration donTime;
    private final Duration doffTime;

    public ArmorType(String identifier,
                     String name,
                     Money cost,
                     ArmorClassCalculation armorClass,
                     StrengthRequirement strengthRequirement,
                     boolean disadvantageToStealthChecks,
                     Weight weight,
                     boolean isMetal,
                     Duration donTime,
                     Duration doffTime) {
        this.identifier = identifier;
        this.name = name;
        this.cost = cost;
        this.armorClass = armorClass;
        this.strengthRequirement = strengthRequirement;
        this.disadvantageToStealthChecks = disadvantageToStealthChecks;
        this.weight = weight;
        this.isMetal = isMetal;
        this.donTime = donTime;
        this.doffTime = doffTime;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Money getCost() {
        return cost;
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

    @Override
    public Weight getWeight() {
        return weight;
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
