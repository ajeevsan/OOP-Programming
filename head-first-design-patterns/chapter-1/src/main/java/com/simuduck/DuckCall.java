package com.simuduck;

import com.simuduck.behaviors.QuackBehavior;
import com.simuduck.behaviors.Quack;

public class DuckCall {
    private QuackBehavior quackBehavior;

    public DuckCall(){
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
        System.out.println("This is the duckcall.");
    }
}