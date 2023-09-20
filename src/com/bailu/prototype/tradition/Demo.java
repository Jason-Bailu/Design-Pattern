package com.bailu.prototype.tradition;

/**
 * @Author: JasonD
 * @date: 2023/9/2 09:41
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
    }
}
