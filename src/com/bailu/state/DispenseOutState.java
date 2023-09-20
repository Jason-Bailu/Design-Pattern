package com.bailu.state;

public class DispenseOutState extends State{
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("the prize is out of resource");
    }

    @Override
    public boolean raffle() {
        System.out.println("the prize is out of resource");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("the prize is out of resource");
    }
}
