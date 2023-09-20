package com.bailu.state;

public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 100; i++) {
            System.out.println("-----------" + i + "---------");
            activity.deductMoney();
            activity.raffle();
        }
    }
}
