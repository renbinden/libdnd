package uk.co.renbinden.libdnd.item.weapon;

import uk.co.renbinden.libdnd.damage.DamageType;
import uk.co.renbinden.libdnd.roll.Roll;

public final class WeaponDamage {

    private final Roll roll;
    private final DamageType damageType;

    public WeaponDamage(Roll roll, DamageType damageType) {
        this.roll = roll;
        this.damageType = damageType;
    }

    public Roll getRoll() {
        return roll;
    }

    public DamageType getDamageType() {
        return damageType;
    }

}
