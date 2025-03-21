package com.learn.systematic.Encapsulation;

public class PaymentProcessor {
    private String cardNumber;
    private double amount;

    public PaymentProcessor(String cardNumber, double amount) {
        this.cardNumber = maskCardNumber(cardNumber);
        this.amount = amount;
    }

    private String maskCardNumber(String cardNumber) {
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }

    public void processPayment() {
        System.out.println("Processing payment of " + amount + " for card " + cardNumber);
    }
}


