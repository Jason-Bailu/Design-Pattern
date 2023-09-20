package com.bailu.singleton.type1;

/**
 * @Author: JasonD
 * @date: 2023/8/29 20:28
 * @Description:
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
    }
}

//饿汉式（静态变量）
class Singleton {
    private Singleton() {
    }
    private final static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
}
