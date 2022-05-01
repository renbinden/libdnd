package uk.co.renbinden.libdnd.language.script;

import uk.co.renbinden.libdnd.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static uk.co.renbinden.libdnd.language.script.phb.PhbScript.*;

public final class ScriptRegistry implements Registry<Script> {

    private final Map<String, Script> scripts;

    private ScriptRegistry(Map<String, Script> scripts) {
        this.scripts = scripts;
    }

    public static final class Builder {
        private final List<Script> scripts;

        public Builder() {
            this.scripts = new ArrayList<>();
        }

        public Builder addPhbScripts() {
            scripts.addAll(List.of(
                    COMMON,
                    DWARVISH,
                    ELVISH,
                    INFERNAL,
                    CELESTIAL,
                    DRACONIC
            ));
            return this;
        }

        public Builder addScript(Script script) {
            scripts.add(script);
            return this;
        }

        public ScriptRegistry build() {
            return new ScriptRegistry(scripts.stream().collect(Collectors.toMap(Script::getIdentifier, script -> script)));
        }
    }

    @Override
    public Script getByIdentifier(String identifier) {
        return scripts.get(identifier);
    }

    @Override
    public List<Script> getAllMatching(Predicate<Script> predicate) {
        return scripts.values().stream().filter(predicate).toList();
    }

    @Override
    public List<Script> getAll() {
        return scripts.values().stream().toList();
    }
}
