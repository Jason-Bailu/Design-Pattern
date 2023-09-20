package com.bailu.facade;

/**
 * @Author: JasonD
 * @date: 2023/9/6 21:33
 * @Description:
 */
public class Screen {
    private Screen() {}

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }
}
