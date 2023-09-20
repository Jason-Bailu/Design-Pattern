package com.bailu.builder.product.detail;

import com.bailu.builder.product.Burger;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:17
 * @Description:
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }
}
