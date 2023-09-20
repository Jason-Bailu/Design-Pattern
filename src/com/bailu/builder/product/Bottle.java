package com.bailu.builder.product;

/**
 * @Author: JasonD
 * @date: 2023/9/2 11:13
 * @Description:
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "Bottle";
    }
}
