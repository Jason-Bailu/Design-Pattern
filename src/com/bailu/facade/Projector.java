package com.bailu.facade;

/**
 * @Author: JasonD
 * @date: 2023/9/6 21:31
 * @Description:
 */
public class Projector {
    private Projector() {}

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("projector on");
    }

    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("project is focusing");
    }
}
