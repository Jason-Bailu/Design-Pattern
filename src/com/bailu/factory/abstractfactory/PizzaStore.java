package com.bailu.factory.abstractfactory;

import com.bailu.factory.abstractfactory.orderfactory.AbsFactory;
import com.bailu.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: JasonD
 * @date: 2023/8/31 19:43
 * @Description:
 */
public class PizzaStore {
    private static String getLocation() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input Location type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getType() {
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

    public static void main(String[] args) {
        Pizza pizza = null;
        do {
            String location = getLocation();
            AbsFactory factory = FactoryProducer.getFactory(location);
            String type = getType();
            pizza = factory.getPizza(type);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }
}
