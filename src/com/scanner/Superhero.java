package com.scanner;
import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String question = input.nextLine();

        System.out.println("What is their superpower?");
        String question2 = input.nextLine();

        System.out.println("Here is the story:");
        System.out.println("There once was as superhero named " + question + " who held the power of " + question2 + ".");
        System.out.println("As they grew older, " + question + " saw that the world needed them.");
        System.out.println(question + " used their ability to " + question2 + " to save the world.");
    }
}
