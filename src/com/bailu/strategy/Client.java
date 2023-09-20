package com.bailu.strategy;

public class Client {
    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        System.out.println(wildDuck.getName());
        wildDuck.fly();

        Duck peckingDuck = new PeckingDuck();
        System.out.println(peckingDuck.getName());
        peckingDuck.fly();

        Duck toyDuck = new ToyDuck();
        System.out.println(toyDuck.getName());
        toyDuck.fly();
    }
}
