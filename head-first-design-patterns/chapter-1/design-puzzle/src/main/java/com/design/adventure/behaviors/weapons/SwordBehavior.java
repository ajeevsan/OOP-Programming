package com.design.adventure.behaviors.weapons;

import com.design.adventure.behaviors.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword!");
    }
}