package PracticingLoops;
import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Give a number.");
            int five = input.nextInt();

            if (five == 5) {
                break;
            }

        }
        System.out.print(" Bingo!");
    }
}
