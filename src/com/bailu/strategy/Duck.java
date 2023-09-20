package com.bailu.strategy;

public abstract class Duck {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void fly();
}
