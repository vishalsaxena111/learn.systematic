package com.learn.systematic.LLD.WithStrategyPattern;

import com.learn.systematic.LLD.WithStrategyPattern.strategy.DriveStrategy;
import com.learn.systematic.LLD.WithStrategyPattern.strategy.NormalDriveStrategy;

public class PassangerVehicle extends Vehicle {

    PassangerVehicle() {
        super(new NormalDriveStrategy());
    }
}
