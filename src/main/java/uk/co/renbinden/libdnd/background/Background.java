package uk.co.renbinden.libdnd.background;

import uk.co.renbinden.libdnd.item.Item;
import uk.co.renbinden.libdnd.item.ItemType;
import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.proficiency.Proficiency;

import java.util.List;

public abstract class Background {

    private final String name;
    private final List<Proficiency> proficiencies;
    private final List<Language> languages;
    private final List<Item<? extends ItemType>> equipment;
    private final Money startingMoney;

    public Background(String name, List<Proficiency> proficiencies, List<Language> languages, List<Item<? extends ItemType>> equipment, Money startingMoney) {
        this.name = name;
        this.proficiencies = proficiencies;
        this.languages = languages;
        this.equipment = equipment;
        this.startingMoney = startingMoney;
    }

    public String getName() {
        return name;
    }

    public List<Proficiency> getProficiencies() {
        return proficiencies;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public List<Item<? extends ItemType>> getEquipment() {
        return equipment;
    }

    public Money getStartingMoney() {
        return startingMoney;
    }
}
