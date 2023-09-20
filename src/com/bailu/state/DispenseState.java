package com.bailu.state;

public class DispenseState extends State{
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("you had already deducted money");
    }

    @Override
    public boolean raffle() {
        if (activity.getCount() > 0) {
            System.out.println("congratulation！！！");
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("the prize is out of resource");
            activity.setState(activity.getDispenseOutState());
            System.out.println("activity is end");
            System.exit(0);
        }
        return false;
    }

    @Override
    public void dispensePrize() {

    }
}
