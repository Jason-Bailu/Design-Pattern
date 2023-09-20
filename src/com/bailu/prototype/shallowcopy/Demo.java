package com.bailu.prototype.shallowcopy;

/**
 * @Author: JasonD
 * @date: 2023/9/2 10:04
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "white", new Sheep("sam", 1, "blue", null));

        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

        System.out.println(sheep1.getFriend() == sheep2.getFriend()); //true 默认浅拷贝
    }
}
