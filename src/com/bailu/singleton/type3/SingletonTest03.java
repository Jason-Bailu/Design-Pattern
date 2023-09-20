package com.bailu.singleton.type3;

/**
 * @Author: JasonD
 * @date: 2023/8/29 20:36
 * @Description:
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
    }
}

//懒汉式
class Singleton {
    private static Singleton instance;
    private Singleton() {};
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
