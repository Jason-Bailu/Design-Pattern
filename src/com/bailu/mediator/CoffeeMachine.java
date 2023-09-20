package com.bailu.mediator;

public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startCoffee() {
        System.out.println("start coffee...");
    }

    @Override
    public void sendMessage(int stateChange) {
        //null for now
    }

    public void makeCoffee() {
        System.out.println("making coffee...");
    }
}
