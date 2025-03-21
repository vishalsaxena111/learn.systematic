package com.learn.systematic.Composition;

public class Transmission {

    private String type;

    public Transmission(String type) {
        this.type = type;
    }

    public void shiftGear() {
        System.out.println("Transmission shifted: " + type);
    }
}
