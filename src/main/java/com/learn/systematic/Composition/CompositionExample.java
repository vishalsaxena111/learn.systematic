package com.learn.systematic.Composition;

public class CompositionExample {
    public static void main(String[] args) {
        Engine engine = new Engine(150);
        Wheel wheel = new Wheel("Alloy");
        Transmission transmission = new Transmission("Automatic");

        Car car = new Car(engine, wheel, transmission);
        car.drive();
    }
}
