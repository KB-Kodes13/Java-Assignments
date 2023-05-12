package objectsInList;
import java.util.Scanner;
import java.util.ArrayList;
public class animalMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();

        while(true) {
            System.out.print("Enter animal name (or nothing to exit loop): ");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog (true/false)? ");
            boolean isADog = input.nextBoolean();
            input.nextLine();

            Animal animal = new Animal(name, isADog);
            animals.add(animal);
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
