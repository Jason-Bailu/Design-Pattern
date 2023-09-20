package com.bailu.bridge;

/**
 * @Author: JasonD
 * @date: 2023/9/4 20:12
 * @Description:
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("xiaomi open...");
    }

    @Override
    public void close() {
        System.out.println("xiaomi close...");
    }

    @Override
    public void call() {
        System.out.println("xiaomi calling...");
    }
}
