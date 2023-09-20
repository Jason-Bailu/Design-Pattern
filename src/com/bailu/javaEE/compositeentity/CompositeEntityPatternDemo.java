package com.bailu.javaEE.compositeentity;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Seconde Test", "Data1");
        client.printData();
    }
}
