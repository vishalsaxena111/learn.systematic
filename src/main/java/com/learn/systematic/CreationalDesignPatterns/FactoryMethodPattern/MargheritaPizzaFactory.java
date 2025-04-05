package com.learn.systematic.CreationalDesignPatterns.FactoryMethodPattern;

public class MargheritaPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
