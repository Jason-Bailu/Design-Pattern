package com.bailu.adapter.interfaceadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:50
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        adapter.m1();
    }
}
