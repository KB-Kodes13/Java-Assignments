package com.scanner;
import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a string of text:");
        String answer = input.nextLine();

        System.out.print("Enter an integer:");
        int answer2 = input.nextInt();

        System.out.print("Enter a double:");
        double answer3 = input.nextDouble();

        System.out.print("Enter a boolean:");
        boolean answer4 = input.nextBoolean();

        System.out.println("Your string is " + answer );
        System.out.println("Your integer is " + answer2);
        System.out.println("Your double is " + answer3);
        System.out.println("Your boolean is " + answer4);


    }
}
