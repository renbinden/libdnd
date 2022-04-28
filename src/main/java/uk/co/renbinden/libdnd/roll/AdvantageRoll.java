package uk.co.renbinden.libdnd.roll;

import java.util.List;
import java.util.stream.Stream;

public class AdvantageRoll extends Roll {

    public AdvantageRoll(RollPart... parts) {
        super(parts);
    }

    @Override
    public List<RollPartResult> roll() {
        List<RollPartResult> result1 = super.roll();
        List<RollPartResult> result2 = super.roll();
        int result1Sum = result1.stream().map(RollPartResult::getResult).reduce(0, Integer::sum);
        int result2Sum = result2.stream().map(RollPartResult::getResult).reduce(0, Integer::sum);
        if (result1Sum >= result2Sum) {
            return result1;
        } else {
            return result2;
        }
    }

    public List<List<RollPartResult>> rollAll() {
        List<RollPartResult> result1 = super.roll();
        List<RollPartResult> result2 = super.roll();
        return Stream.of(
                result1,
                result2
        ).sorted(
                (a, b) -> b.stream().map(RollPartResult::getResult).reduce(0, Integer::sum)
                        - a.stream().map(RollPartResult::getResult).reduce(0, Integer::sum)
        ).toList();
    }

    @Override
    public String toString() {
        return "Advantage on " + super.toString();
    }
}
