package uk.co.renbinden.libdnd.clazz;

import uk.co.renbinden.libdnd.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static uk.co.renbinden.libdnd.clazz.phb.PhbClass.*;

public class ClassRegistry implements Registry<Clazz> {

    private final Map<String, Clazz> classes;

    public ClassRegistry(Map<String, Clazz> classes) {
        this.classes = classes;
    }

    public static class Builder {
        private final List<Clazz> classes;

        public Builder() {
            this.classes = new ArrayList<>();
        }

        public Builder addPhbClasses() {
            classes.addAll(List.of(
                    BARBARIAN,
                    BARD,
                    CLERIC,
                    DRUID,
                    FIGHTER,
                    MONK,
                    PALADIN,
                    RANGER,
                    ROGUE,
                    SORCERER,
                    WARLOCK,
                    WIZARD
            ));
            return this;
        }

        public Builder addClass(Clazz clazz) {
            classes.add(clazz);
            return this;
        }

        public ClassRegistry build() {
            return new ClassRegistry(classes.stream().collect(Collectors.toMap(Clazz::getIdentifier, clazz -> clazz)));
        }
    }

    @Override
    public Clazz getByIdentifier(String identifier) {
        return classes.get(identifier.toLowerCase());
    }

    @Override
    public List<Clazz> getAllMatching(Predicate<Clazz> predicate) {
        return classes.values().stream().filter(predicate).toList();
    }
}
