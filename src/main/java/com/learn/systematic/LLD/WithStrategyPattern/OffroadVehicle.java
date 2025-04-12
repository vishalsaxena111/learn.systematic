package com.learn.systematic.LLD.WithStrategyPattern;

import com.learn.systematic.LLD.WithStrategyPattern.strategy.DriveStrategy;
import com.learn.systematic.LLD.WithStrategyPattern.strategy.SpecialDriveStrategy;

public class OffroadVehicle extends Vehicle {

    OffroadVehicle() {
        super(new SpecialDriveStrategy());
    }


}
