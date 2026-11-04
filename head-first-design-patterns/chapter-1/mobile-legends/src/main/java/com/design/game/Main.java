package com.game;

import com.game.skills.*;
import com.game.heroes.*;

public class Main {

    public static void main(String[] args) {
        Mage mage = new Mage();

        mage.setSkill(new Aegis());

        mage.useSkill();

        mage.useSkill();

        mage.setSill(new Flicker());

        mage.useSkill();
    }
}