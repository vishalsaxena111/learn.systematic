package com.learn.systematic.CreationalDesignPatterns.AbstractFactoryPattern;


// Product class
public class Phone
{
    String description;
    public Phone(String model)
    {
        this.description = model;
    }
    public void getDescription()
    {
        System.out.println("you are getting "+this.description);
    }
}
