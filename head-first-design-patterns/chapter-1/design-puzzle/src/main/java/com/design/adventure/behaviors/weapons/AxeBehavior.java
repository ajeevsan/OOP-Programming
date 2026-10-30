package com.design.adventure.behaviors.weapons;

import com.design.adventure.behaviors.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {

    @Override 
    public void useWeapon() {
         System.out.println("Chopping with an axe!");
    }
}