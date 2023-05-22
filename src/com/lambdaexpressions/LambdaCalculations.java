package com.lambdaexpressions;
public class LambdaCalculations {
    public static void main(String[] args) {
        // Addition
        Calculation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.perform(5, 3)); // Answer: 8

        // Subtraction
        Calculation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.perform(5, 3)); // Answer: 2

        // Multiplication
        Calculation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.perform(5, 3)); // Answer: 15

        // Division
        Calculation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                return 0; // Anything divided by 0 will be 0
            }
        };
        System.out.println("Division: " + division.perform(10, 2)); // Answer: 5
    }

    interface Calculation {
        int perform(int a, int b);
    }
}

