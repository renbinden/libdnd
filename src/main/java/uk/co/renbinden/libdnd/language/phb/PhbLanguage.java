package uk.co.renbinden.libdnd.language.phb;

import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.language.script.phb.PhbScript;

public final class PhbLanguage {
    public static final Language COMMON = new Language("Common", PhbScript.COMMON);
    public static final Language DWARVISH = new Language("Dwarvish", PhbScript.DWARVISH);
    public static final Language ELVISH = new Language("Elvish", PhbScript.ELVISH);
    public static final Language GIANT = new Language("Giant", PhbScript.DWARVISH);
    public static final Language GNOMISH = new Language("Gnomish", PhbScript.DWARVISH);
    public static final Language GOBLIN = new Language("Goblin", PhbScript.DWARVISH);
    public static final Language HALFLING = new Language("Halfling", PhbScript.COMMON);
    public static final Language ABYSSAL = new Language("Abyssal", PhbScript.INFERNAL);
    public static final Language CELESTIAL = new Language("Celestial", PhbScript.CELESTIAL);
    public static final Language DEEP_SPEECH = new Language("Deep Speech", null);
    public static final Language DRACONIC = new Language("Draconic", PhbScript.DRACONIC);
    public static final Language INFERNAL = new Language("Infernal", PhbScript.INFERNAL);
    public static final Language PRIMORDIAL = new Language("Primordial", PhbScript.DWARVISH);
    public static final Language SYLVAN = new Language("Sylvan", PhbScript.ELVISH);
    public static final Language UNDERCOMMON = new Language("Undercommon", PhbScript.ELVISH);

    private PhbLanguage() {}
}
