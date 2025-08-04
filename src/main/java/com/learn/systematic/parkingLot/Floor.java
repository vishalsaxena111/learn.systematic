package com.learn.systematic.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private int floorNumber;
    private int capacity;

    private List<Spot> spotList = new ArrayList<>();

    public List<Spot> getSpotList() {
        return spotList;
    }

    public void addSpot(Spot spot) {
        spotList.add(spot);
    }


    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Floor(int floorNumber, int capacity) {

        for (int i = 0; i < capacity; i++) {
            spotList.add(new Spot(true));
        }


        this.floorNumber = floorNumber;
        this.capacity = capacity;
    }

    public Spot getFreeSpot() {
        for (Spot spot : spotList) {
            if (spot.getFree()) return spot;
        }
        return null; // or throw exception
    }

    public boolean hasFreeSpot() {
        return spotList.stream().anyMatch(Spot::getFree);
    }


    public List<Spot> getFreeSpots() {
        List<Spot> freeSpots = new ArrayList<>();
        for (Spot spot : spotList) {
            if (spot.getFree()) {
                freeSpots.add(spot);
            }
        }
        return freeSpots;
    }



}
