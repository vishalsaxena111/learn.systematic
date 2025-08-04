package com.learn.systematic.parkingLot;

public class Car extends Vehicle {

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

    Car(String number) {
       super(number);
    }
}

