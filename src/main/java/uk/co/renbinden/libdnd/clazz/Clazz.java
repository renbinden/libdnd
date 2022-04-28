package uk.co.renbinden.libdnd.clazz;

import uk.co.renbinden.libdnd.ability.Ability;
import uk.co.renbinden.libdnd.roll.Roll;

public final class Clazz {

    private final String name;
    private final Roll hitDie;
    private final Ability primaryAbility;
    private final int baseHp;
    private final int levelHp;
    private final MulticlassingRequirement multiclassingRequirement;

    public Clazz(String name,
                 Roll hitDie,
                 Ability primaryAbility,
                 int baseHp,
                 int levelHp,
                 MulticlassingRequirement multiclassingRequirement) {
        this.name = name;
        this.hitDie = hitDie;
        this.primaryAbility = primaryAbility;
        this.baseHp = baseHp;
        this.levelHp = levelHp;
        this.multiclassingRequirement = multiclassingRequirement;
    }

    public String getName() {
        return name;
    }

    public Roll getHitDie() {
        return hitDie;
    }

    public Ability getPrimaryAbility() {
        return primaryAbility;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public int getLevelHp() {
        return levelHp;
    }

    public MulticlassingRequirement getMulticlassingRequirement() {
        return multiclassingRequirement;
    }
}
