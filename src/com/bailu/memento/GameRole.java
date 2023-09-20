package com.bailu.memento;

public class GameRole {
    private int vit;
    private int def;

    public GameRole(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Memento createMemento() {
        return new Memento(this.vit, this.def);
    }

    public void recoverFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", def=" + def +
                '}';
    }
}
