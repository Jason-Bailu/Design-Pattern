package com.bailu.strategy;

public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Good fly behavior");
    }
}
