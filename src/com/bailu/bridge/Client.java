package com.bailu.bridge;

/**
 * @Author: JasonD
 * @date: 2023/9/4 20:18
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();

        phone = new UpRightPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
    }
}
