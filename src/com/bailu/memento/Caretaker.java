package com.bailu.memento;

import java.util.ArrayList;
import java.util.HashMap;

public class Caretaker {
    //仅保存一个状态
    private Memento memento;
    //保存多个状态
    //private ArrayList<Memento> mementos;
    //保存不同对象的不同状态
    //private HashMap<String, ArrayList<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
