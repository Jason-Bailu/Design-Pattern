package com.bailu.flyweight;

/**
 * @Author: JasonD
 * @date: 2023/9/6 22:18
 * @Description:
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
