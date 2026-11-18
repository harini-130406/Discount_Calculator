package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double finalAmount = calculator.calculateFinalAmount(amount);

        System.out.println("Final amount: Rs. " + finalAmount);

        sc.close();
    }
}