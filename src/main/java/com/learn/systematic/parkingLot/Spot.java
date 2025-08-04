package com.learn.systematic.parkingLot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.LongConsumer;

public class Spot {

    private boolean isFree= true;

    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    private Vehicle vehicle;

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Spot(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isFree = false;
        this.entryTime = LocalDateTime.now();
    }

    public Spot(boolean isFree) {
        this.isFree = isFree;
    }

    public Duration getDuration() {
        if (entryTime != null && exitTime != null) {
            return Duration.between(entryTime, exitTime);
        }
        return Duration.ZERO;
    }

}
