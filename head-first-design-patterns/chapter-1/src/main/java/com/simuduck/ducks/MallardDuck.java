package com.simuduck.ducks;

import com.simuduck.Duck;
import com.simuduck.behaviors.FlyWithWings;
import com.simuduck.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}