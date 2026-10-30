package com.simuduck;

import com.simuduck.ducks.MallardDuck;
import com.simuduck.ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        DuckCall duckCall = new DuckCall();

        duckCall.performQuack();
        

        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("---");

        Duck rubberDuck = new RubberDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}