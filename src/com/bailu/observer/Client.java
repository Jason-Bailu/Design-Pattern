package com.bailu.observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        NormalCondition normalCondition = new NormalCondition();
        BaiduCondition baiduCondition = new BaiduCondition();
        weatherData.registerObserver(normalCondition);
        weatherData.registerObserver(baiduCondition);
        weatherData.setData(31.0f, 100f, 30.3f);
        System.out.println("==========after remove baidu=================");
        weatherData.removeObserver(baiduCondition);
        weatherData.setData(32.0f, 101f, 30.5f);
    }
}
