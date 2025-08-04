package com.learn.systematic.parkingLot;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class ParkingLot {

    private static ParkingLot INSTANCE;

    private List<Floor> floorList;

   private ParkingLot(){}

    public static ParkingLot getInstance(List<Floor> floorList){

       if(INSTANCE==null) {
           INSTANCE = new ParkingLot();
           INSTANCE.floorList = floorList;
       }

        System.out.println("ParkingLot created with "+ floorList.size() +" floors");

       return INSTANCE;

    }

    public void insertVehicle(Vehicle v) {
        for (Floor floor : floorList) {
            for (Spot spot : floor.getSpotList()) {
                if (spot.getFree()) {
                    spot.setVehicle(v);
                    spot.setEntryTime(LocalDateTime.now());
                    spot.setFree(false);
                    System.out.println("Spot occupied for vehicle " + v.getNumber());
                    return;
                }
            }
        }
        System.out.println("No available spot for vehicle " + v.getNumber());
    }

    public void removeVehicle(String number) {
        for (Floor floor : floorList) {
            for (Spot spot : floor.getSpotList()) {
                Vehicle vehicle = spot.getVehicle();
                if (!spot.getFree() && vehicle != null && vehicle.getNumber().equals(number)) {
                    spot.setExitTime(LocalDateTime.now());
                    spot.setFree(true);
                    System.out.println("Vehicle " + number + " removed from spot.");
                    System.out.println("Duration: " +
                            java.time.Duration.between(spot.getEntryTime(), spot.getExitTime()).toMinutes() + " minutes");
                    spot.setVehicle(null); // clear vehicle reference
                    return;
                }
            }
        }
        System.out.println("Vehicle " + number + " not found in the parking lot.");
    }




}
