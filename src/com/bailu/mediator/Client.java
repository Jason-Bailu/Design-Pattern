package com.bailu.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");
        TV tv = new TV(mediator, "TV");
        Curtains curtains = new Curtains(mediator, "Curtains");
        alarm.sendMessage(0);
        coffeeMachine.makeCoffee();
        alarm.sendMessage(1);
    }
}
