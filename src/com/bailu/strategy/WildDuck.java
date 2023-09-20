package com.bailu.strategy;

public class WildDuck extends Duck{
    private FlyBehavior flyBehavior;
    public WildDuck() {
        super("WildDuck");
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
