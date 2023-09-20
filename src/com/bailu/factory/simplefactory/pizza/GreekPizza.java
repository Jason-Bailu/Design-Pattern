package com.bailu.factory.simplefactory.pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/30 23:29
 * @Description:
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for greek pizza");
    }
}
