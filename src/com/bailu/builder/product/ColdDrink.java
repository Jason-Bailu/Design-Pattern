package com.bailu.builder.product;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:15
 * @Description:
 */
public abstract class ColdDrink implements Iterm{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
