package com.bailu.adapter.classadapter;

/**
 * @Author: JasonD
 * @date: 2023/9/3 20:25
 * @Description:
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5v() {
        int src = output220V();
        int dis = src / 44;
        return dis;
    }
}
