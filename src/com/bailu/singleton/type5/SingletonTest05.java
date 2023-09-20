package com.bailu.singleton.type5;

/**
 * @Author: JasonD
 * @date: 2023/8/29 20:47
 * @Description:
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
    }
}

//双重检查
class Singleton {
    //volatile可以理解为轻量synchronized
    private static volatile Singleton singleton;
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
