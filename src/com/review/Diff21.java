package com.review;

public class Diff21 {
    public static int diff21(int n) {
        // Checked to see if n is less than or equal to 21
        if (n <= 21) {
            // Calculated the absolute difference between 21 and n (21 - n)
            return 21 - n; // Returned the absolute difference
        } else {
            // Calculated the difference between n and 21 (n - 21)
            // Multiplied the difference by 2 to get double the absolute difference
            return (n - 21) * 2; // Returned double the absolute difference
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(diff21(19)); // Output: 2
        System.out.println(diff21(10)); // Output: 11
        System.out.println(diff21(21)); // Output: 0
    }
}
