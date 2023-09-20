package com.bailu.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator{
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV) colleagueMap.get(interMap.get("TV"))).startTV();
            } else if (stateChange == 1) {
                ((TV) colleagueMap.get(interMap.get("TV"))).stopTV();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //null
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //null
        }
    }

    @Override
    public void sendMessage() {
        //null
    }
}
