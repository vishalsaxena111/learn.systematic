package com.learn.systematic.LLD.WithStrategyPattern.strategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("special capability");
    }
}
