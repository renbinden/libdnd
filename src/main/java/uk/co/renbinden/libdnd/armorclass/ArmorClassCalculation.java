package uk.co.renbinden.libdnd.armorclass;

import uk.co.renbinden.libdnd.ability.Ability;
import uk.co.renbinden.libdnd.character.DndCharacter;

import java.util.List;

public final class ArmorClassCalculation {

    private List<Component> components;

    public ArmorClassCalculation(ArmorClassCalculation.Component... components) {
        this.components = List.of(components);
    }

    public interface Component {
        public int calculateValue(DndCharacter character);
    }

    public static final class BaseArmorClassComponent implements Component {

        private final int value;

        public BaseArmorClassComponent(int value) {
            this.value = value;
        }

        @Override
        public int calculateValue(DndCharacter character) {
            return value;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }

    }

    public static final class AbilityModifierArmorClassComponent implements Component {

        private final Ability ability;

        public AbilityModifierArmorClassComponent(Ability ability) {
            this.ability = ability;
        }

        @Override
        public int calculateValue(DndCharacter character) {
            return character.getModifier(ability);
        }

        @Override
        public String toString() {
            return ability.getAbbreviation() + " modifier";
        }

    }

    public static final class CappedAbilityModifierArmorClassComponent implements Component {

        private final Ability ability;
        private final int cap;

        public CappedAbilityModifierArmorClassComponent(Ability ability, int cap) {
            this.ability = ability;
            this.cap = cap;
        }

        @Override
        public int calculateValue(DndCharacter character) {
            return Math.min(cap, character.getModifier(ability));
        }

        @Override
        public String toString() {
            return ability.getAbbreviation() + " modifier (max " + cap + ")";
        }

    }

    public ArmorClass calculate(DndCharacter character) {
        return new ArmorClass(components.stream()
                .map(component -> component.calculateValue(character))
                .reduce(0, Integer::sum));
    }

    @Override
    public String toString() {
        return components.stream().map(Component::toString).reduce((a, b) -> a + " + " + b).orElse("0");
    }

}