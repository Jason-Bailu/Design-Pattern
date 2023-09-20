package com.bailu.factory.abstractfactory.orderfactory;

import com.bailu.factory.abstractfactory.pizza.LDCheesePizza;
import com.bailu.factory.abstractfactory.pizza.LDPepperPizza;
import com.bailu.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/31 19:40
 * @Description:
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza getPizza(String type) {
        if (type.equals("Cheese")) {
            return new LDCheesePizza();
        } else if (type.equals("Pepper")) {
            return new LDPepperPizza();
        }
        return null;
    }
}
