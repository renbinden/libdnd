package uk.co.renbinden.libdnd.language;

import uk.co.renbinden.libdnd.language.script.Script;

public final class Language {
    private final String identifier;
    private final String name;
    private final Script script;
    private final boolean isExotic;

    public Language(String identifier, String name, Script script, boolean isExotic) {
        this.identifier = identifier;
        this.name = name;
        this.script = script;
        this.isExotic = isExotic;
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

    public boolean isExotic() {
        return isExotic;
    }
}
