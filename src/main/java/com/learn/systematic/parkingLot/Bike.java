package com.learn.systematic.parkingLot;

public class Bike extends Vehicle{

      public  Bike(String number){
           super(number);
        }

    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }
}
