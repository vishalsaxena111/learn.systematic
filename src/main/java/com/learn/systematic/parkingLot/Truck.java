package com.learn.systematic.parkingLot;

public class Truck extends Vehicle{

    Truck(String number){
        super(number);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
}
