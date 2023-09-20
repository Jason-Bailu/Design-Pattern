package com.bailu.flyweight;

/**
 * @Author: JasonD
 * @date: 2023/9/6 22:12
 * @Description:
 */
public class ConcreteWebSite extends WebSite{
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("website: " + type + "by user: " + user.getName());
    }
}
