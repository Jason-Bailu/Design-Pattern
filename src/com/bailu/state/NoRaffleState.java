package com.bailu.state;

public class NoRaffleState extends State {
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("deduct money 50");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("you need deduct money firstly");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("can't dispense prize");
    }
}
