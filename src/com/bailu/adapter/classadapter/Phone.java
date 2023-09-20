package com.bailu.adapter.classadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:22
 * @Description:
 */
public class Phone {
    public void charging(IVoltage5V ivoltage5V) {
        if (ivoltage5V.output5v() == 5) {
            System.out.println("电压为5v，可以充电");
        } else if (ivoltage5V.output5v() > 5) {
            System.out.println("电压大于5v，不能充电");
        }
    }
}
