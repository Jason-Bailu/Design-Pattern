package com.bailu.state;

import java.util.Random;

public class CanRaffleState extends State{
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("you had already deducted money");
    }

    @Override
    public boolean raffle() {
        System.out.println("raffling");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("it's too pity");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("you haven't got the prize");
    }
}
