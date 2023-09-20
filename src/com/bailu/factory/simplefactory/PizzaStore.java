package com.bailu.factory.simplefactory;

import com.bailu.factory.simplefactory.order.OrderPizza;
import com.bailu.factory.simplefactory.order.SimpleFactory;

/**
 * @Author: JasonD
 * @date: 2023/8/30 23:38
 * @Description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        //OrderPizza orderPizza = new OrderPizza();
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
        System.out.println("exit");
    }
}
