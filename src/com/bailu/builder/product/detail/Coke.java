package com.bailu.builder.product.detail;

import com.bailu.builder.product.ColdDrink;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:18
 * @Description:
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
