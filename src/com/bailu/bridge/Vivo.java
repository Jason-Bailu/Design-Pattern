package com.bailu.bridge;

/**
 * @Author: JasonD
 * @date: 2023/9/4 20:13
 * @Description:
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo open...");
    }

    @Override
    public void close() {
        System.out.println("vivo close...");
    }

    @Override
    public void call() {
        System.out.println("vivo calling...");
    }
}
