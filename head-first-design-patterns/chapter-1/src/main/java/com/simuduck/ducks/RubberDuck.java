package com.simuduck.ducks;

import com.simuduck.Duck;
import com.simuduck.behaviors.FlyNoWay;
import com.simuduck.behaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}