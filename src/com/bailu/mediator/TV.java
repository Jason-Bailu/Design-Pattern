package com.bailu.mediator;

public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startTV() {
        System.out.println("start TV");
    }

    public void stopTV() {
        System.out.println("stop TV");
    }

    @Override
    public void sendMessage(int stateChange) {
        //null for now
    }
}
