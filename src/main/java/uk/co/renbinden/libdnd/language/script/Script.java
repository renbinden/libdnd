package uk.co.renbinden.libdnd.language.script;

public final class Script {
    private final String identifier;
    private final String name;

    public Script(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }
}
