package uk.co.renbinden.libdnd.ability;

public final class DifficultyClass {

    public static final DifficultyClass VERY_EASY = new DifficultyClass(5);
    public static final DifficultyClass EASY = new DifficultyClass(10);
    public static final DifficultyClass MEDIUM = new DifficultyClass(15);
    public static final DifficultyClass HARD = new DifficultyClass(20);
    public static final DifficultyClass VERY_HARD = new DifficultyClass(25);
    public static final DifficultyClass NEARLY_IMPOSSIBLE = new DifficultyClass(30);

    private final int value;

    public DifficultyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
