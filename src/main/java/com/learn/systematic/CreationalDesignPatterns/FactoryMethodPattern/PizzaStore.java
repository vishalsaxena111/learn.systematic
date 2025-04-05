package com.learn.systematic.CreationalDesignPatterns.FactoryMethodPattern;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PepperoniPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        // Use the pizza object
    }
}
