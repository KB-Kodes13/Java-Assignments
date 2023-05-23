package com.debug;

public class CalculateAverage {
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
}

//Null Pointer Exception
// In the main method if you set numbers = to null below it creates a null pointer exception which means that the program is trying to access or manipulate data through a null reference.
// We can use this in debugging to provide an error message or stack trace that indicates the location in the code where the exception occurred which in this instance would be line 6 and 15

//Array Index Out of Bounds Exception
// If you modify the main method to pass an empty array to the calculateAverage method it will cause an array index out of bounds exception.
//This is because the array has a length of 0, and you want to access its elements for the for loop, your exception would also be on line 6 for this debugging error.

//When I clicked on the debugger and ran the code in debug mode I set a breakpoint at the lines 6 because that's where my exceptions are located, I ran the program. The debugger paused the execution at the breakpoint.
// I was able to inspect the variables and manipulate them to see what different outcomes were possible and also step through the code to see how it was actually executed, pretty cool stuff.

//Logical Error
// A logical error can occur on line 9 if you accidentally use a % symbol instead of the / symbol the output for average returns 0.0 because 5 goes into 15 evenly, the program is still able to run and does not throw an
//error, but you do not receive the desired output because the logic is not right, to fix this logic you would simply switch to the correct division symbol to receive the desired outcome

//Above is the corrected code after working through the exceptions and logical errors.