package uk.co.renbinden.libdnd.language;

import uk.co.renbinden.libdnd.language.script.Script;

public final class Language {
    private final String identifier;
    private final String name;
    private final Script script;

    public Language(String identifier, String name, Script script) {
        this.identifier = identifier;
        this.name = name;
        this.script = script;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public Script getScript() {
        return script;
    }
}
