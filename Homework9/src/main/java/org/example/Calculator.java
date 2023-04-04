package org.example;

public class Calculator {
    public static int multiply(int a, int b) throws ProductExceptions {
        if (a % 2 != 0 || b % 2 != 0) {
            throw new ProductExceptions("Invalid Input: Both numbers must be even.");
        }
        return a * b;
    }
}
