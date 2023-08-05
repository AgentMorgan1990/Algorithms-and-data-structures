package ru.examples.design_patterns.behavioral_поведенческие.startegy_стратегия.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
