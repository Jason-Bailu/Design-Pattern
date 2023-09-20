package com.bailu.observer;

public class BaiduCondition implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("today temperature: " + this.temperature + " from baidu");
        System.out.println("today pressure: " + this.pressure + " from baidu");
        System.out.println("today humidity: " + this.humidity + " from baidu");
    }
}
