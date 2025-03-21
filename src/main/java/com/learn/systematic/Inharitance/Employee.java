package com.learn.systematic.Inharitance;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}
