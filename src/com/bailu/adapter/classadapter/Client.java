package com.bailu.adapter.classadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:26
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("电源适配器");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
