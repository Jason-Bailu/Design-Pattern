package com.bailu.factory.abstractfactory.orderfactory;

import com.bailu.factory.abstractfactory.pizza.BJCheesePizza;
import com.bailu.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/31 19:31
 * @Description:
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza getPizza(String type) {
        if (type.equals("Cheese")) {
            return new BJCheesePizza();
        } else if (type.equals("Pepper")) {
            return new BJCheesePizza();
        }
        return null;
    }
}
