package com.learn.systematic.parkingLot;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Floor> floors = Arrays.asList(new Floor(1,2),
                new Floor(2,2));
        ParkingLot parkingLot = ParkingLot.getInstance(floors);


        Vehicle v1 = new Bike("UP 1234");
        parkingLot.insertVehicle(v1);
        System.out.println("Vehicle inserted "+ v1.getNumber());


        Vehicle v2 = new Truck("UP 2345");
        parkingLot.insertVehicle(v2);
        System.out.println("Vehicle inserted " + v2.getNumber());


        Vehicle v3 = new Bike("UP 3456");
        parkingLot.insertVehicle(v3);
        System.out.println("Vehicle inserted " + v3.getNumber());


        Vehicle v4 = new Bike("UP 3456222");
        parkingLot.insertVehicle(v4);
        System.out.println("Vehicle inserted " + v4.getNumber());


        Vehicle v5 = new Bike("UP 3456111");
        parkingLot.insertVehicle(v5);
        System.out.println("Vehicle inserted " + v5.getNumber());



        for (Floor floor : floors) {
            System.out.println("Floor " + floor.getFloorNumber() + " has " + floor.getFreeSpots().size() + " free spots.");
        }


        parkingLot.removeVehicle("UP 1234");

        System.out.println("After");

        for (Floor floor : floors) {
            System.out.println("Floor " + floor.getFloorNumber() + " has " + floor.getFreeSpots().size() + " free spots.");
        }



    }
}
