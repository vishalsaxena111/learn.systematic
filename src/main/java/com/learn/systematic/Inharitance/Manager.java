package com.learn.systematic.Inharitance;

public class Manager extends Employee{
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}
