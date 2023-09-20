package com.bailu.factory.factorymethod.order;

import com.bailu.factory.factorymethod.pizza.BJCheesePizza;
import com.bailu.factory.factorymethod.pizza.BJPepperPizza;
import com.bailu.factory.factorymethod.pizza.Pizza;

/**
 * @Author: JasonD
 * @date: 2023/8/31 00:18
 * @Description:
 */
public class BJOrder extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
