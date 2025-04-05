package com.learn.systematic.CreationalDesignPatterns.FactoryMethodPattern;

public class PepperoniPizza implements  Pizza{
    public PepperoniPizza(){
        System.out.println("Creating PepperoniPizza Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Cook preparing PepperoniPizza Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Cook baking PepperoniPizza Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cook cutting PepperoniPizza Pizza");
    }

    @Override
    public void box() {
        System.out.println("Cook boxing PepperoniPizza Pizza");
    }
}
