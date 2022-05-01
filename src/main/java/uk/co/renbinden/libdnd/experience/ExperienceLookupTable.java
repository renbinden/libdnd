package uk.co.renbinden.libdnd.experience;

public abstract class ExperienceLookupTable {

    public abstract int getExperienceRequiredForLevel(int level);
    public abstract int getLevelAtExperience(int experience);
    public abstract int getMaxExperience();

    public static final ExperienceLookupTable DEFAULT = new ExperienceLookupTable() {

        private static final int MAX_EXPERIENCE = 355000;

        public int getExperienceRequiredForLevel(int level) {
            return switch (level) {
                case 1 -> 0;
                case 2 -> 300;
                case 3 -> 900;
                case 4 -> 2700;
                case 5 -> 6500;
                case 6 -> 14000;
                case 7 -> 23000;
                case 8 -> 34000;
                case 9 -> 48000;
                case 10 -> 64000;
                case 11 -> 85000;
                case 12 -> 100000;
                case 13 -> 120000;
                case 14 -> 140000;
                case 15 -> 165000;
                case 16 -> 195000;
                case 17 -> 225000;
                case 18 -> 265000;
                case 19 -> 305000;
                case 20 -> 355000;
                default -> Integer.MAX_VALUE;
            };
        }

        public int getLevelAtExperience(int experience) {
            int level = 1;
            while (getExperienceRequiredForLevel(level + 1) <= experience) {
                level++;
            }
            return level;
        }

        @Override
        public int getMaxExperience() {
            return MAX_EXPERIENCE;
        }

    };
}
