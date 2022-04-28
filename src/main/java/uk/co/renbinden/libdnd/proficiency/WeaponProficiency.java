package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.item.weapon.WeaponType;

public interface WeaponProficiency extends Proficiency {

    boolean isApplicable(WeaponType weaponType);

}
