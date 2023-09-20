package com.bailu.prototype.deepcopy;

/**
 * @Author: JasonD
 * @date: 2023/9/2 10:17
 * @Description:
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1, "white", new Sheep("sam", 1, "blue", null));

        //通过重写的clone方法深拷贝
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

        System.out.println(sheep1.getFriend() == sheep2.getFriend()); //深拷贝 false

        //序列化实现深拷贝
        sheep1 = sheep.deepCopy();
        sheep2 = sheep.deepCopy();
        sheep3 = sheep.deepCopy();
        sheep4 = sheep.deepCopy();

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

        System.out.println(sheep1.getFriend() == sheep2.getFriend()); //false
    }
}
