package com.bailu.singleton.type2;

/**
 * @Author: JasonD
 * @date: 2023/8/29 20:28
 * @Description:
 */
public class SingletonTest02 {
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
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
