package com.learn.systematic.LLD.WithStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Capability");
    }
}
