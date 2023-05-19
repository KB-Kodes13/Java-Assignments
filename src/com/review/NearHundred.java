package com.review;

public class NearHundred {

    public static boolean nearHundred(int n) {
        // Checked if the absolute difference between n and 100 is less than or equal to 10
        boolean within10Of100 = Math.abs(n - 100) <= 10;

        // Checked if the absolute difference between n and 200 is less than or equal to 10
        boolean within10Of200 = Math.abs(n - 200) <= 10;

        // Returned true if either of the above conditions is true
        return within10Of100 || within10Of200;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(nearHundred(93)); // Output: true
        System.out.println(nearHundred(90)); // Output: true
        System.out.println(nearHundred(89)); // Output: false
    }
}
