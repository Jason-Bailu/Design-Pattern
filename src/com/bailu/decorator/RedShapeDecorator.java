package com.bailu.decorator;

/**
 * @Author: JasonD
 * @date: 2023/9/4 22:00
 * @Description:
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    //扩展的方法
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: Red");
    }
}
