package com.review;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // Checked if it's not a weekday or if we're on vacation
        if (!weekday || vacation) {
            return true; // We sleep in
        } else {
            return false; // We don't sleep in and get to it
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sleepIn(false, false)); // Output: true
        System.out.println(sleepIn(true, false)); // Output: false
        System.out.println(sleepIn(false, true)); // Output: true
    }
}
