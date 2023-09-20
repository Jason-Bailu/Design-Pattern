package com.bailu.decorator;

/**
 * @Author: JasonD
 * @date: 2023/9/4 22:00
 * @Description:
 */
public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
