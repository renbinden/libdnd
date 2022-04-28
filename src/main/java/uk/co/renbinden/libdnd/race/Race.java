package uk.co.renbinden.libdnd.race;

import uk.co.renbinden.libdnd.ability.Ability;
import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.skill.Skill;

import java.util.*;

public abstract class Race {

    private final String name;
    private final Map<Ability, Integer> abilityScoreModifiers = new EnumMap<>(Ability.class);
    private final int maturityAge;
    private final int maximumAge;
    private final Distance minimumHeight;
    private final Distance maximumHeight;
    private final Distance speed;
    private final Distance darkVision;
    private final Set<Skill> skillProficiencies = EnumSet.noneOf(Skill.class);
    private final List<RaceTrait> traits = new ArrayList<>();
    private final HpBonusFunction hpBonusFunction;

    public Race(String name,
                int maturityAge,
                int maximumAge,
                Distance minimumHeight,
                Distance maximumHeight,
                Distance speed,
                Distance darkVision,
                HpBonusFunction hpBonusFunction) {
        this.name = name;
        this.maturityAge = maturityAge;
        this.maximumAge = maximumAge;
        this.minimumHeight = minimumHeight;
        this.maximumHeight = maximumHeight;
        this.speed = speed;
        this.darkVision = darkVision;
        this.hpBonusFunction = hpBonusFunction;
    }

    public Race(String name,
                int maturityAge,
                int maximumAge,
                Distance minimumHeight,
                Distance maximumHeight,
                Distance speed,
                Distance darkVision) {
        this(
                name,
                maturityAge,
                maximumAge,
                minimumHeight,
                maximumHeight,
                speed,
                darkVision,
                level -> 0
        );
    }

    public String getName() {
        return name;
    }

    public int getAbilityScoreModifier(Ability ability) {
        return abilityScoreModifiers.get(ability);
    }

    public int getMaturityAge() {
        return maturityAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public Distance getMinimumHeight() {
        return minimumHeight;
    }

    public Distance getMaximumHeight() {
        return maximumHeight;
    }

    public Distance getSpeed() {
        return speed;
    }

    public Distance getDarkVision() {
        return darkVision;
    }

    public Set<Skill> getSkillProficiencies() {
        return skillProficiencies;
    }

    public List<RaceTrait> getTraits() {
        return traits;
    }

    public int getHpBonus(int level) {
        return hpBonusFunction.getHPBonus(level);
    }
}
