package com.game.herors;

import com.game.skills.SkillBehavior;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int attackDamage;

    protected SkillBehavior skill;


    public abstract void fight();

    public abstract void display(); 

    public void setSkill(SkillBehavior skill) {
        this.skill = skill;
    }

    public void useSKill() {
        if(skill==null) {
            System.out.println("No Skill Equipped.");
            return;
        }
        skill.useSKill();
    }
}