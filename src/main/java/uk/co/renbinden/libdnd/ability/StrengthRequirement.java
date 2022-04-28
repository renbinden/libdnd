package uk.co.renbinden.libdnd.ability;

import static uk.co.renbinden.libdnd.ability.Ability.STRENGTH;

public class StrengthRequirement extends AbilityRequirement {
    public StrengthRequirement(int minimum) {
        super(STRENGTH, minimum);
    }
}
