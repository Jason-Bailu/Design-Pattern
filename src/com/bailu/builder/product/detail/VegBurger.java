package com.bailu.builder.product.detail;

import com.bailu.builder.product.Burger;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:16
 * @Description:
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "VegBurger";
    }
}
