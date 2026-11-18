package org.example;

public class DiscountCalculator {

    public double calculateFinalAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        if (amount >= 1000) {
            return amount - (amount * 0.10);
        } else {
            return amount;
        }
    }
}