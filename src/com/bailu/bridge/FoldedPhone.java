package com.bailu.bridge;

/**
 * @Author: JasonD
 * @date: 2023/9/4 20:15
 * @Description:
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("folded phone");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("folded phone");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("folded phone");
    }
}
