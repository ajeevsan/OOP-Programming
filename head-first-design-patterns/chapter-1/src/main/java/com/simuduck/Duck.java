package com.simuduck;

import com.simuduck.behaviors.FlyBehavior;
import com.simuduck.behaviors.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }

    public abstract void display();
}