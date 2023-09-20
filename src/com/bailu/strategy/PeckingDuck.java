package com.bailu.strategy;

public class PeckingDuck extends Duck{
    private FlyBehavior flyBehavior;

    public PeckingDuck() {
        super("PeckingDuck");
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
