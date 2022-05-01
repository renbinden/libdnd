package uk.co.renbinden.libdnd.language.phb;

import uk.co.renbinden.libdnd.language.Language;
import uk.co.renbinden.libdnd.language.script.phb.PhbScript;

public final class PhbLanguage {
    public static final Language COMMON = new Language("common", "Common", PhbScript.COMMON, false);
    public static final Language DWARVISH = new Language("dwarvish", "Dwarvish", PhbScript.DWARVISH, false);
    public static final Language ELVISH = new Language("elvish", "Elvish", PhbScript.ELVISH, false);
    public static final Language GIANT = new Language("giant", "Giant", PhbScript.DWARVISH, false);
    public static final Language GNOMISH = new Language("gnomish", "Gnomish", PhbScript.DWARVISH, false);
    public static final Language GOBLIN = new Language("goblin", "Goblin", PhbScript.DWARVISH, false);
    public static final Language HALFLING = new Language("halfling", "Halfling", PhbScript.COMMON, false);
    public static final Language ORC = new Language("orc", "Orc", PhbScript.DWARVISH, false);
    public static final Language ABYSSAL = new Language("abyssal", "Abyssal", PhbScript.INFERNAL, true);
    public static final Language CELESTIAL = new Language("celestial", "Celestial", PhbScript.CELESTIAL, true);
    public static final Language DEEP_SPEECH = new Language("deep_speech", "Deep Speech", null, true);
    public static final Language DRACONIC = new Language("draconic", "Draconic", PhbScript.DRACONIC, true);
    public static final Language INFERNAL = new Language("infernal", "Infernal", PhbScript.INFERNAL, true);
    public static final Language PRIMORDIAL = new Language("primordial", "Primordial", PhbScript.DWARVISH, true);
    public static final Language SYLVAN = new Language("sylvan", "Sylvan", PhbScript.ELVISH, true);
    public static final Language UNDERCOMMON = new Language("undercommon", "Undercommon", PhbScript.ELVISH, true);

    private PhbLanguage() {}
}
