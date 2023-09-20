package com.bailu.builder.product;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:14
 * @Description:
 */
public abstract class Burger implements Iterm {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
