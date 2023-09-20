package com.bailu.factory.factorymethod.pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/31 00:10
 * @Description:
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for ld pepper pizza");
    }
}
