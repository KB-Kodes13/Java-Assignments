package com.review;

public class StringSplosion {
    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder(); // Created a StringBuilder to store the resulting string
        for (int i = 0; i < str.length(); i++) { // Iterate over the characters of the input string
            result.append(str.substring(0, i + 1)); // Append a substring from index 0 to the current index
        }
        return result.toString(); // Return the resulting string
    }

    public static void main(String[] args) {
        // Test the stringSplosion function
        System.out.println(stringSplosion("Code")); // Output: "CCoCodCode"
        System.out.println(stringSplosion("abc")); // Output: "aababc"
        System.out.println(stringSplosion("ab")); // Output: "aab"
    }
}
