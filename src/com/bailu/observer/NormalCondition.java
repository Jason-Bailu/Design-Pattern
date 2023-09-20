package com.bailu.observer;

public class NormalCondition implements Observer{
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
        System.out.println("today temperature: " + this.temperature);
        System.out.println("today pressure: " + this.pressure);
        System.out.println("today humidity: " + this.humidity);
    }
}
