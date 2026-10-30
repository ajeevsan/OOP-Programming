package com.design.adventure;

import com.design.adventure.characters.*;
import com.design.adventure.weapons.*;

public class Main {
    public static void main(String[] args) {
        
        Character queen = new Queen();

        queen.setWeapon(new SwordBehavior());
        queen.fight();

        System.out.println("--- Switching Weapon ---");

        // Change weapon dynamically
        queen.setWeapon(new AxeBehavior());
        queen.fight();
    }
}