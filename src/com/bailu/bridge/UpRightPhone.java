package com.bailu.bridge;

/**
 * @Author: JasonD
 * @date: 2023/9/4 20:17
 * @Description:
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("upright phone");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("upright phone");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("upright phone");
    }
}
