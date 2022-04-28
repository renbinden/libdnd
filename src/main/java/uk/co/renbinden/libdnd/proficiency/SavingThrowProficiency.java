package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.ability.Ability;

public class SavingThrowProficiency implements Proficiency {

    private final Ability ability;

    public SavingThrowProficiency(Ability ability) {
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

}
