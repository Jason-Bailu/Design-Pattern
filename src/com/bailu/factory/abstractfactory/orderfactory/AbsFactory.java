package com.bailu.factory.abstractfactory.orderfactory;

import com.bailu.factory.abstractfactory.pizza.Pizza;

public interface AbsFactory {
    public Pizza getPizza(String type);
}
