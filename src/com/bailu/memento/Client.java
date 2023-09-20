package com.bailu.memento;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100, 100);

        System.out.println("before the battle");
        System.out.println(gameRole);
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("after the battle");
        gameRole.setVit(30);
        gameRole.setDef(30);
        System.out.println(gameRole);

        System.out.println("recover");
        gameRole.recoverFromMemento(caretaker.getMemento());
        System.out.println(gameRole);
    }
}
