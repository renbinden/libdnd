package uk.co.renbinden.libdnd.language;

import uk.co.renbinden.libdnd.language.script.Script;

public final class Language {
    private final String name;
    private final Script script;

    public Language(String name, Script script) {
        this.name = name;
        this.script = script;
    }

    public String getName() {
        return name;
    }

    public Script getScript() {
        return script;
    }
}
