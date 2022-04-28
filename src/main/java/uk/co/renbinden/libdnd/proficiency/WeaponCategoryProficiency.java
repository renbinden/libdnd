package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.item.weapon.WeaponType;

public class WeaponCategoryProficiency<T extends WeaponType> implements WeaponProficiency {

    private final Class<T> category;

    public WeaponCategoryProficiency(Class<T> category) {
        this.category = category;
    }

    public boolean isApplicable(WeaponType weaponType) {
        return category.isInstance(weaponType);
    }

}
