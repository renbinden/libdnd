package uk.co.renbinden.libdnd.item.weapon;

import uk.co.renbinden.libdnd.item.ItemType;
import uk.co.renbinden.libdnd.item.weapon.property.WeaponProperty;

import java.util.List;

public interface WeaponType extends ItemType {

    WeaponDamage getDamage();
    List<WeaponProperty> getProperties();

}
