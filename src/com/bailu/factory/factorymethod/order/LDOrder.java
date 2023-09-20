package com.bailu.factory.factorymethod.order;

import com.bailu.factory.factorymethod.pizza.*;

/**
 * @Author: JasonD
 * @date: 2023/8/31 00:18
 * @Description:
 */
public class LDOrder extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
