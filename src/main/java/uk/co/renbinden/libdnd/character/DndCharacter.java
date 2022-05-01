package uk.co.renbinden.libdnd.character;

import uk.co.renbinden.libdnd.ability.Ability;
import uk.co.renbinden.libdnd.ability.AbilityCheckResult;
import uk.co.renbinden.libdnd.alignment.Alignment;
import uk.co.renbinden.libdnd.background.Background;
import uk.co.renbinden.libdnd.clazz.Clazz;
import uk.co.renbinden.libdnd.experience.ExperienceLookupTable;
import uk.co.renbinden.libdnd.item.armor.ArmorType;
import uk.co.renbinden.libdnd.item.tool.ToolType;
import uk.co.renbinden.libdnd.item.weapon.WeaponType;
import uk.co.renbinden.libdnd.proficiency.*;
import uk.co.renbinden.libdnd.race.Race;
import uk.co.renbinden.libdnd.roll.Roll;
import uk.co.renbinden.libdnd.roll.RollPartResult;
import uk.co.renbinden.libdnd.skill.Skill;

import java.util.*;

import static uk.co.renbinden.libdnd.ability.Ability.CONSTITUTION;
import static uk.co.renbinden.libdnd.ability.AbilityModifierLookupTable.lookupModifier;

public class DndCharacter {

    private String name;
    private int age;
    private Race race;
    private final Map<Clazz, Integer> clazzLevels = new HashMap<>();
    private Clazz firstClass;
    private int experience;
    private Background background;
    private Alignment alignment;
    private final Map<Ability, Integer> initialAbilityScores = new EnumMap<>(Ability.class);
    private final Map<Ability, Integer> abilityScores = new EnumMap<>(Ability.class);
    private final Map<Ability, Integer> tempScores = new EnumMap<>(Ability.class);
    private int hp;
    private int tempHp;
    private boolean isInspired;
    private final List<Proficiency> proficiencies;

    public DndCharacter(String name, int age, Race race, Clazz firstClass, int experience, Background background, Alignment alignment, int hp, int tempHp) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.firstClass = firstClass;
        this.experience = experience;
        this.background = background;
        this.alignment = alignment;
        this.hp = hp;
        this.tempHp = tempHp;
        this.proficiencies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Clazz getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(Clazz firstClass) {
        this.firstClass = firstClass;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return ExperienceLookupTable.getLevelAtExperience(getExperience());
    }

    public void setClassLevel(Clazz clazz, int level) {
        if (clazzLevels.isEmpty()) {
            setFirstClass(clazz);
        }
        clazzLevels.put(clazz, level);
    }

    public int getClassLevel(Clazz clazz) {
        return clazzLevels.getOrDefault(clazz, 0);
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getInitialAbilityScore(Ability ability) {
        return initialAbilityScores.getOrDefault(ability, 0);
    }

    public void setInitialAbilityScore(Ability ability, int score) {
        initialAbilityScores.put(ability, score);
    }

    public int getAbilityScore(Ability ability) {
        return abilityScores.getOrDefault(ability, 0);
    }

    public void setAbilityScore(Ability ability, int score) {
        abilityScores.put(ability, score);
    }

    public int getTempScore(Ability ability) {
        return tempScores.get(ability);
    }

    public void setTempScore(Ability ability, int score) {
        tempScores.put(ability, score);
    }

    public int getModifier(Ability ability) {
        Race race = getRace();
        return lookupModifier(
                getAbilityScore(ability)
                + getTempScore(ability)
                + (race != null ? race.getAbilityScoreModifier(ability) : 0)
        );
    }

    public int getMaxHp() {
        return (getFirstClass() != null ? getFirstClass().getBaseHp() : 1)
                + (getModifier(CONSTITUTION) * getLevel())
                + clazzLevels.entrySet().stream()
                .map(clazzLevel -> (clazzLevel.getValue() - (clazzLevel.getKey() == firstClass ? 1 : 0)) * clazzLevel.getKey().getLevelHp())
                .reduce(0, Integer::sum)
                + (getRace() != null ? getRace().getHpBonus(getLevel()) : 0);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTempHp() {
        return tempHp;
    }

    public void setTempHp(int tempHp) {
        this.tempHp = tempHp;
    }

    public boolean isInspired() {
        return isInspired;
    }

    public void setInspired(boolean inspired) {
        isInspired = inspired;
    }

    public void addProficiency(Proficiency proficiency) {
        proficiencies.add(proficiency);
    }

    public boolean hasProficiency(Ability ability) {
        return proficiencies.stream()
                .anyMatch(proficiency -> proficiency instanceof SavingThrowProficiency
                        && ((SavingThrowProficiency) proficiency).getAbility() == ability);
    }

    public boolean hasProficiency(Skill skill) {
        return proficiencies.stream()
                .anyMatch(proficiency -> proficiency instanceof SkillProficiency
                        && ((SkillProficiency) proficiency).getSkill() == skill);
    }

    public boolean hasProficiency(ToolType toolType) {
        return proficiencies.stream()
                .anyMatch(proficiency -> proficiency instanceof ToolProficiency
                        && ((ToolProficiency<?>) proficiency).getToolType() == toolType);
    }

    public boolean hasProficiency(WeaponType weaponType) {
        return proficiencies.stream()
                .anyMatch(proficiency -> proficiency instanceof WeaponProficiency
                        && ((WeaponProficiency) proficiency).isApplicable(weaponType));
    }

    public boolean hasProficiency(ArmorType armorType) {
        return proficiencies.stream()
                .anyMatch(proficiency -> proficiency instanceof ArmorProficiency
                        && ((ArmorProficiency<?>) proficiency).isApplicable(armorType));
    }

    public boolean hasProficiency(VehicleProficiency.VehicleProficiencyType vehicleType) {
        return proficiencies.stream()
                .anyMatch(proficiency -> proficiency instanceof VehicleProficiency
                        && ((VehicleProficiency) proficiency).getType() == vehicleType);
    }

    public AbilityCheckResult doAbilityCheck(Ability ability, int bonus, int requirement) {
        Roll roll = new Roll(
                new Roll.Die(20),
                new Roll.Modifier(getModifier(ability)),
                new Roll.Modifier(bonus)
        );
        List<RollPartResult> rollResult = roll.roll();
        return new AbilityCheckResult(
                rollResult.stream()
                        .map(RollPartResult::getResult)
                        .reduce(0, Integer::sum) >= requirement,
                rollResult
        );
    }

    public AbilityCheckResult doAbilityCheck(Ability ability, int requirement) {
        return doAbilityCheck(ability, 0, requirement);
    }

}
