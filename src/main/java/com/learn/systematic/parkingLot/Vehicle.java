package com.learn.systematic.parkingLot;

public abstract class Vehicle {

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public abstract VehicleType getType();

    public Vehicle(String number) {
        this.number = number;
    }



}
