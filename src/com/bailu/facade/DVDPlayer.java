package com.bailu.facade;

/**
 * @Author: JasonD
 * @date: 2023/9/6 21:28
 * @Description:
 */
public class DVDPlayer {
    private DVDPlayer() {
    }

    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd playing");
    }

    public void pause() {
        System.out.println("dvd pause...");
    }
}
