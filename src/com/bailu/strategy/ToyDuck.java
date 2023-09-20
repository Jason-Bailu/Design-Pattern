package com.bailu.strategy;

public class ToyDuck extends Duck{
    private FlyBehavior flyBehavior;

    public ToyDuck() {
        super("ToyDuck");
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}