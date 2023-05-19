package com.review;

public class HelloName {
    public static String helloName(String name) {
        return "Hello " + name + "!"; // joining the name with the greeting

    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(helloName("Bob")); // Output: "Hello Bob!"
        System.out.println(helloName("Alice")); // Output: "Hello Alice!"
        System.out.println(helloName("X")); // Output: "Hello X!"
    }
}
