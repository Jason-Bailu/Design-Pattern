package com.bailu.singleton.type7;

/**
 * @Author: JasonD
 * @date: 2023/8/29 21:16
 * @Description:
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton);
        singleton.sayOK();
    }
}

//枚举
enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("OK");
    }
}
