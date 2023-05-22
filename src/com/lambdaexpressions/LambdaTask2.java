package com.lambdaexpressions;

public class LambdaTask2 {
    public static void main(String[] args) {
            // Modify a String functional interface
            StringModifier toUpperCase = (str) -> str.toUpperCase();
            System.out.println("Uppercase: " + toUpperCase.modify("ctac, you know!")); // Output: CTAC, YOU KNOW!

            // Even Number functional interface
            NumberEvaluator isEven = (num) -> num % 2 == 0;
            System.out.println("Is Even? " + isEven.evaluate(13)); // Output: false
            System.out.println("Is Even? " + isEven.evaluate(24)); // Output: true
             // Comparing two numbers functional interface
            NumberComparator greaterThan = (a, b) -> a > b;
            System.out.println("Is 7 greater than 21? " + greaterThan.compare(7, 21)); // Output: false
        }
        @FunctionalInterface
        interface StringModifier {
            String modify(String str);
        }
        @FunctionalInterface
        interface NumberEvaluator {
            boolean evaluate(int num);
        }
        @FunctionalInterface
        interface NumberComparator {
        boolean compare(int a, int b);
        }

}
