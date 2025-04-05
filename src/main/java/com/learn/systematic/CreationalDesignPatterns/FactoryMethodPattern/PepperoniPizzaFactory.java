package com.learn.systematic.CreationalDesignPatterns.FactoryMethodPattern;

public class PepperoniPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {

        return new PepperoniPizza();
    }
}
