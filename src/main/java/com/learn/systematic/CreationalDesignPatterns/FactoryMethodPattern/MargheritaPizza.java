package com.learn.systematic.CreationalDesignPatterns.FactoryMethodPattern;

public class MargheritaPizza  implements Pizza{

    public MargheritaPizza(){
        System.out.println("Creating Margherita Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Cook preparing Margherita Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Cook baking Margherita Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cook cutting Margherita Pizza");
    }

    @Override
    public void box() {
        System.out.println("Cook boxing Margherita Pizza");
    }
}
