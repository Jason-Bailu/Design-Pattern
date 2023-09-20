package com.bailu.bridge;

/**
 * @Author: JasonD
 * @date: 2023/9/4 20:14
 * @Description:
 */
public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void close() {
        brand.close();
    }

    public void call() {
        brand.call();
    }
}
