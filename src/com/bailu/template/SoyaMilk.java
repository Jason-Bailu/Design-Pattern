package com.bailu.template;

/**
 * @Author: JasonD
 * @date: 2023/9/8 23:05
 * @Description:
 */
public abstract class SoyaMilk {
    final void make() {
        select();
        //通过钩子函数
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("1 selecting...");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("3 soaking...");
    }

    void beat() {
        System.out.println("4 beating...");
    }

    //钩子方法
    boolean customerWantCondiments() {
        return true;
    }
}
