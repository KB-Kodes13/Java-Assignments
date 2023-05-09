package PracticingLoops;
import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int answer = num * i;
            System.out.println(num + " x " + i + " = " + answer);
        }

    }
}
