package PracticingMethods;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello custom method!");
        hello(1);

        System.out.println("Hello again!");
        hello(2);

    }
    public static void hello(int number) {
        int i = 0;
        while (i < number) {
            System.out.println("Hello!");
            i++;
        }
    }
}
