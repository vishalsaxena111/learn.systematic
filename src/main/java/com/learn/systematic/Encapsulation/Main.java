package com.learn.systematic.Encapsulation;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment = new PaymentProcessor("1234567812345678", 250.00);
        payment.processPayment();
    }

}
