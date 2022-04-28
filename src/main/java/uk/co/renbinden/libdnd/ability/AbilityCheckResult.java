package uk.co.renbinden.libdnd.ability;

import uk.co.renbinden.libdnd.roll.RollPartResult;

import java.util.List;

public final class AbilityCheckResult {

    private final boolean isPassed;
    private final List<RollPartResult> rollResult;

    public AbilityCheckResult(boolean isPassed, List<RollPartResult> rollResult) {
        this.isPassed = isPassed;
        this.rollResult = rollResult;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public List<RollPartResult> getRollResult() {
        return rollResult;
    }

}
