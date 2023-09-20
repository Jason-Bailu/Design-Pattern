package com.bailu.compostie;

/**
 * @Author: JasonD
 * @date: 2023/9/4 22:21
 * @Description:
 */
public class Department extends Organization{
    public Department(String name, String describe) {
        super(name, describe);
    }

    //add remove由于是叶子节点就不需要重写

    @Override
    protected void print() {
        System.out.println(super.getName());
    }
}
