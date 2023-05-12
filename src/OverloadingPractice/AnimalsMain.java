package OverloadingPractice;

import java.util.Scanner;
import java.util.ArrayList;
public class AnimalsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Animals> animals = new ArrayList<Animals>();
        while(true) {
            System.out.print("Enter animal name (or nothing to exit loop): ");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog (true/false)? ");
            boolean isADog = input.nextBoolean();
            input.nextLine();

            System.out.print("How many legs does the animal have: ");
            int legs = Integer.parseInt(input.nextLine());


            System.out.print("What is the animals hair color: ");
            String hairColor = input.nextLine();

            Animals animal = new Animals(name, isADog, legs, hairColor);
            animals.add(animal);


        }
        for (Animals animal : animals) {
            System.out.println(animal.toString());
        }
    }

}
