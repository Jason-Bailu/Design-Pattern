package com.bailu.factory.factorymethod.pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/31 00:04
 * @Description:
 */
public abstract class Pizza {
    String name;
    public abstract void prepare();

    public void bake() {
        System.out.println("start baking");
    }

    public void cut() {
        System.out.println("start cutting");
    }

    public void box() {
        System.out.println("start boxing");
    }
}
