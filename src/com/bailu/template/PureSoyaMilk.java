package com.bailu.template;

/**
 * @Author: JasonD
 * @date: 2023/9/8 23:11
 * @Description:
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
