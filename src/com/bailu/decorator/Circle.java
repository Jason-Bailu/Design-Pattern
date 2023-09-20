package com.bailu.decorator;

/**
 * @Author: JasonD
 * @date: 2023/9/4 21:59
 * @Description:
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("shape: Circle");
    }
}
