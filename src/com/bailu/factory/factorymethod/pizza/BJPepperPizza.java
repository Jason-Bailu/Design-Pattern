package com.bailu.factory.factorymethod.pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/31 00:09
 * @Description:
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for bj papper pizza");
    }
}
