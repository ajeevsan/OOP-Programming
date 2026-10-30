package com.design.adventure.characters;

public class Queen extends Character {

    @Override
    public void fight() {
        System.out.println("Queen is fighthing!");;
        weapon.useWeapon();
    }
}