package com.bailu.factory.simplefactory.order;

import com.bailu.factory.simplefactory.pizza.CheesePizza;
import com.bailu.factory.simplefactory.pizza.GreekPizza;
import com.bailu.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: JasonD
 * @date: 2023/8/30 23:28
 * @Description: 静态工厂模式
 */
public class OrderPizza {
    //如果需要添加新的pizza种类，除了需要新写一个类，而且需要更改该处的代码
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//            } else {
//                break;
//            }
//            pizza.prepare();
//        } while (true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
            } else {
                System.out.println("failed");
                break;
            }
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
