package com.bailu.factory.abstractfactory;

import com.bailu.factory.abstractfactory.orderfactory.AbsFactory;
import com.bailu.factory.abstractfactory.orderfactory.BJFactory;
import com.bailu.factory.abstractfactory.orderfactory.LDFactory;

/**
 * @Author: JasonD
 * @date: 2023/8/31 19:42
 * @Description:
 */
public class FactoryProducer {
    public static AbsFactory getFactory(String choice) {
        if (choice.equals("BJ")) {
            return new BJFactory();
        } else if (choice.equals("LD")) {
            return new LDFactory();
        }
        return null;
    }
}
