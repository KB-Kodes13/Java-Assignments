package PracticingLoops;
import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter any number.");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                System.out.println("Number must be a positive number!");
                continue;
            }
            else {
            System.out.println("Number is " + num);
            }

        }
    }
}

