package com.review;

public class MakeOutWord {
    public static String makeOutWord(String out, String word) {
        String start = out.substring(0, 2); // Took out the first two characters of the "out" string
        String end = out.substring(2); // Took out the remaining characters of the "out" string

        String newString = start + word + end; // Connected the "start" string, the "word", and the "end" string

        return newString; // Returned the new string
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(makeOutWord("<<>>", "Yay")); // Output: "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo")); // Output: "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word")); // Output: "[[word]]"
    }
}
