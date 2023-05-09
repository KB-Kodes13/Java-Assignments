package ConditionalStatements;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name a number between 0 and 100:");
        int num = input.nextInt();

        if (num <= 69) {
            System.out.print("Your grade is an F :(");
        } else if (num >= 70 && num <= 79)
        {
            System.out.print("Your grade is an C :/");
        } else if (num >= 80 && num <= 89)
        {
            System.out.print("Your grade is an B :)");
        } else if (num >= 90)
        {
            System.out.print("Your grade is an A :)");
        }

    }
}
