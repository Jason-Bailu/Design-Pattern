package com.bailu.factory.factorymethod.order;

import com.bailu.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: JasonD
 * @date: 2023/8/31 00:12
 * @Description:
 */
public abstract class OrderPizza {
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        do {
            String orderType = getType();
            pizza = createPizza(orderType); //由子工厂类实现
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
