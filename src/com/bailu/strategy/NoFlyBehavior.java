package com.bailu.strategy;

public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
