package uk.co.renbinden.libdnd.language.phb;

import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.language.script.phb.PhbScript;

public final class PhbLanguage {
    public static final Language COMMON = new Language("common", "Common", PhbScript.COMMON);
    public static final Language DWARVISH = new Language("dwarvish", "Dwarvish", PhbScript.DWARVISH);
    public static final Language ELVISH = new Language("elvish", "Elvish", PhbScript.ELVISH);
    public static final Language GIANT = new Language("giant", "Giant", PhbScript.DWARVISH);
    public static final Language GNOMISH = new Language("gnomish", "Gnomish", PhbScript.DWARVISH);
    public static final Language GOBLIN = new Language("goblin", "Goblin", PhbScript.DWARVISH);
    public static final Language HALFLING = new Language("halfling", "Halfling", PhbScript.COMMON);
    public static final Language ABYSSAL = new Language("abyssal", "Abyssal", PhbScript.INFERNAL);
    public static final Language CELESTIAL = new Language("celestial", "Celestial", PhbScript.CELESTIAL);
    public static final Language DEEP_SPEECH = new Language("deep_speech", "Deep Speech", null);
    public static final Language DRACONIC = new Language("draconic", "Draconic", PhbScript.DRACONIC);
    public static final Language INFERNAL = new Language("infernal", "Infernal", PhbScript.INFERNAL);
    public static final Language PRIMORDIAL = new Language("primordial", "Primordial", PhbScript.DWARVISH);
    public static final Language SYLVAN = new Language("sylvan", "Sylvan", PhbScript.ELVISH);
    public static final Language UNDERCOMMON = new Language("undercommon", "Undercommon", PhbScript.ELVISH);

    private PhbLanguage() {}
}
