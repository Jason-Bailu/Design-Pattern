package com.bailu.mediator;

public class Curtains extends Colleague{
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void upCurtains() {
        System.out.println("Curtains uping now...");
    }

    @Override
    public void sendMessage(int stateChange) {
        //null for now
    }
}
