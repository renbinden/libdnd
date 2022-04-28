package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.item.armor.ArmorType;

public class ArmorProficiency<T extends ArmorType> implements Proficiency {

    private final Class<T> type;

    public ArmorProficiency(Class<T> type) {
        this.type = type;
    }

    public boolean isApplicable(ArmorType armorType) {
        return type.isInstance(armorType);
    }

}
