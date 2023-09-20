package com.bailu.facade;

/**
 * @Author: JasonD
 * @date: 2023/9/6 21:29
 * @Description:
 */
public class Popcorn {
    private Popcorn() {}

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn is popping");
    }
}
