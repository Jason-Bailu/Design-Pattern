package com.bailu.singleton.type6;

/**
 * @Author: JasonD
 * @date: 2023/8/29 21:03
 * @Description:
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
    }
}

//静态内部类，推荐使用
class Singleton {
    private Singleton() {}

    //静态内部类，有一个静态属性Singleton，在类加载的时候它不会立刻加载，保证懒加载
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
