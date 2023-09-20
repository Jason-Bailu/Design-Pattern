package com.bailu.strategy;

public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Bad fly behavior");
    }
}
