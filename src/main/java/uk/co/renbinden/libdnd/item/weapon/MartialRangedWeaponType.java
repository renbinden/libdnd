package uk.co.renbinden.libdnd.item.weapon;

import uk.co.renbinden.libdnd.item.weapon.property.WeaponProperty;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import java.util.List;

public class MartialRangedWeaponType implements MartialWeaponType, RangedWeaponType {

    private final String identifier;
    private final String name;
    private final Money cost;
    private final WeaponDamage damage;
    private final Weight weight;
    private final List<WeaponProperty> properties;

    public MartialRangedWeaponType(String identifier, String name, Money cost, WeaponDamage damage, Weight weight, WeaponProperty... properties) {
        this.identifier = identifier;
        this.name = name;
        this.cost = cost;
        this.damage = damage;
        this.weight = weight;
        this.properties = List.of(properties);
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

    @Override
    public WeaponDamage getDamage() {
        return damage;
    }

    @Override
    public Weight getWeight() {
        return weight;
    }

    @Override
    public List<WeaponProperty> getProperties() {
        return properties;
    }

}
