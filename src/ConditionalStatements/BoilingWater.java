package ConditionalStatements;
import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater than 212:");
        int num = input.nextInt();

        if (num >= 212) {
            System.out.print("Water is boiling!");
        } else {
            System.out.print("Error 404, You Did Not Follow Instructions!");
        }


    }
}
