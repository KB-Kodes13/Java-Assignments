package com.lambdaexpressions;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class LambdaTask3 {
    public static void main(String[] args) {
        //Predicate example
        int maxLength = 5;

        Predicate<String> isLongerThan = str -> str.length() > maxLength;

        String input1 = "Java";
        String input2 = "JavaScript";

        System.out.println(isLongerThan.test(input1));  // Output: false
        System.out.println(isLongerThan.test(input2));  // Output: true

        //Function Example
        Function<String, Integer> countCharacters = str -> str.length();

        String input = "Atlanta Falcons";
        int result = countCharacters.apply(input);

        System.out.println("Number of characters: " + result);  // Output: Number of characters: 15

        //Consumer Example
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());

        printUpperCase.accept("apollo creed");  // Output: APOLLO CREED

        //Supplier Example
        Supplier<Double> getRandomNumber = () -> Math.random();

        System.out.println(getRandomNumber.get());  // Output: a random number between 0 and 1
    }
}
