package com.bailu.prototype.shallowcopy;

/**
 * @Author: JasonD
 * @date: 2023/9/2 09:38
 * @Description:
 */

//必须要实现接口Cloneable
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    private Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    // super.clone默认浅拷贝
    @Override
    public Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        sheep = (Sheep) super.clone();
        return sheep;
    }
}
