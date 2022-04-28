package uk.co.renbinden.libdnd.roll;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Roll {

    private final List<RollPart> parts;

    public interface RollPart {
        RollPartResult determine();
    }

    public static final class Die implements RollPart {
        private final int rolls;
        private final int sides;
        private final int multiplier;
        private final Random random;

        public Die(int rolls, int sides, int multiplier, Random random) {
            this.rolls = rolls;
            this.sides = sides;
            this.multiplier = multiplier;
            this.random = random;
        }

        public Die(int rolls, int sides, int multiplier) {
            this(rolls, sides, multiplier, new Random());
        }

        public Die(int rolls, int sides) {
            this(rolls, sides, 1);
        }

        public Die(int sides) {
            this(1, sides);
        }

        public RollPartResult determine() {
            List<Integer> results = new ArrayList<>(rolls);
            for (int i = 0; i < rolls; i++) {
                results.add(multiplier * (random.nextInt(sides) + 1));
            }
            return new RollPartResult(
                    this,
                    results
            );
        }

        @Override
        public String toString() {
            return (Math.signum(multiplier) < 0 ? "-" : "")
                    + (Math.abs(multiplier) != 1 ? "(" : "")
                    + rolls + "d" + sides
                    + (Math.abs(multiplier) != 1 ? " × " + multiplier + ")" : "");
        }
    }

    public static final class Modifier implements RollPart {

        private final int value;

        public Modifier(int value) {
            this.value = value;
        }

        public RollPartResult determine() {
            List<Integer> results = new ArrayList<>(1);
            results.add(value);
            return new RollPartResult(
                    this,
                    results
            );
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }

    }

    public Roll(RollPart... parts) {
        this.parts = List.of(parts);
    }

    public List<RollPartResult> roll() {
        return parts.stream()
                .map(RollPart::determine)
                .collect(Collectors.toList());
    }

    public static Roll parse(String rollString) throws NumberFormatException {
        List<RollPart> parts = new ArrayList<>();
        Pattern diePattern = Pattern.compile("[+\\-]\\d*d\\d+");
        String fullRollString = rollString.startsWith("+") ? rollString : "+" + rollString;
        Matcher dieMatcher = diePattern.matcher(fullRollString);
        while (dieMatcher.find()) {
            String dieRollString = dieMatcher.group();
            int multiplier = dieRollString.startsWith("-") ? -1 : 1;
            String[] rollSections = dieRollString.split("d");
            String diceAmountString = rollSections[0].substring(1);
            int dieFaces = Integer.parseInt(rollSections[1]);
            int rollCount = diceAmountString.isEmpty() ? 1 : Integer.parseInt(diceAmountString);
            parts.add(new Die(rollCount, dieFaces, multiplier));
        }
        String rollStringWithoutDice = fullRollString.replaceAll("[+\\-]\\d*d\\d+", "");
        Pattern literalPattern = Pattern.compile("([+\\-]\\d+)(?!d)");
        Matcher literalMatcher = literalPattern.matcher(rollStringWithoutDice);
        while (literalMatcher.find()) {
            int amount = Integer.parseInt(literalMatcher.group(1));
            parts.add(new Modifier(amount));
        }
        return new Roll(parts.toArray(new RollPart[0]));
    }

    public AdvantageRoll advantage() {
        return new AdvantageRoll(parts.toArray(new RollPart[0]));
    }

    public DisadvantageRoll disadvantage() {
        return new DisadvantageRoll(parts.toArray(new RollPart[0]));
    }

    @Override
    public String toString() {
        String roll = parts.stream()
                .map(RollPart::toString)
                .reduce("", (a, b) -> a + (b.startsWith("-") ? "" : "+") + b);
        if (roll.startsWith("+"))
            return roll.substring(1);
        else
            return roll;
    }

}
