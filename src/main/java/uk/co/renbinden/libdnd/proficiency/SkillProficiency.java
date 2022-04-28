package uk.co.renbinden.libdnd.proficiency;

import uk.co.renbinden.libdnd.skill.Skill;

public class SkillProficiency implements Proficiency {

    private final Skill skill;

    public SkillProficiency(Skill skill) {
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

}
