package com.learn.systematic.LLD.WithStrategyPattern;

import com.learn.systematic.LLD.WithStrategyPattern.strategy.DriveStrategy;

public class Vehicle {

   DriveStrategy strategyObject ;

    // constructor injection
   Vehicle(DriveStrategy obj){
       this.strategyObject = obj;
   }

   public void drive(){
       this.strategyObject.drive();
   }

}
