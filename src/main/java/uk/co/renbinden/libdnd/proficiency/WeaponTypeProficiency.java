package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.item.weapon.WeaponType;

public class WeaponTypeProficiency implements WeaponProficiency {

    private final WeaponType weaponType;

    public WeaponTypeProficiency(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public boolean isApplicable(WeaponType weaponType) {
        return this.weaponType == weaponType;
    }
}
