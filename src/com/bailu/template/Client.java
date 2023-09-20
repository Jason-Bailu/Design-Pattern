package com.bailu.template;

/**
 * @Author: JasonD
 * @date: 2023/9/8 23:09
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("make the red bean soyamilk");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        System.out.println("make the peanut soyamilk");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("make the pure soyamilk");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
