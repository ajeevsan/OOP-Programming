package com.design.adventure.character;

import com.design.adventure.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}