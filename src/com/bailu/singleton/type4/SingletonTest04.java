package com.bailu.singleton.type4;

/**
 * @Author: JasonD
 * @date: 2023/8/29 20:40
 * @Description:
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1 == singleton);
    }
}

//懒汉式安全
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    //加入同步处理代码，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
