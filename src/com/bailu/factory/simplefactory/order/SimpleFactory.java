package com.bailu.factory.simplefactory.order;

import com.bailu.factory.simplefactory.pizza.CheesePizza;
import com.bailu.factory.simplefactory.pizza.GreekPizza;
import com.bailu.factory.simplefactory.pizza.Pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/30 23:49
 * @Description: 简单工厂类
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("through the simple factory");
        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
