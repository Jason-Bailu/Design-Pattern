package com.bailu.compostie;

/**
 * @Author: JasonD
 * @date: 2023/9/4 22:15
 * @Description:
 */
public abstract class Organization {
    private String name;
    private String describe;

    public Organization(String name, String describe) {
        super();
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    protected void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();
}
