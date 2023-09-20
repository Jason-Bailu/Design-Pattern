package com.bailu.builder;

import com.bailu.builder.product.*;
import com.bailu.builder.product.detail.ChickenBurger;
import com.bailu.builder.product.detail.Coke;
import com.bailu.builder.product.detail.Pepsi;
import com.bailu.builder.product.detail.VegBurger;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:23
 * @Description:
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
