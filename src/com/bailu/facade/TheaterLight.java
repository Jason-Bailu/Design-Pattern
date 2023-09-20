package com.bailu.facade;

/**
 * @Author: JasonD
 * @date: 2023/9/6 21:36
 * @Description:
 */
public class TheaterLight {
    private TheaterLight() {}

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("theater light on");
    }

    public void off() {
        System.out.println("theater light off");
    }

    public void dim() {
        System.out.println("theater light dim");
    }

    public void bright() {
        System.out.println("theater light bright");
    }

}
