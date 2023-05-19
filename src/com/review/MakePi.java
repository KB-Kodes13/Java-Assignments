package com.review;

public class MakePi {
    public static int[] makePi() {
        int[] piArray = {3, 1, 4}; // Created an integer array with the first 3 digits of pi

        return piArray; // Return the piArray
    }

    public static void main(String[] args) {
        int[] result = makePi(); // Call the makePi method and store the result in an array

        // Printed the elements of the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        // Output: 3 1 4
    }
}
