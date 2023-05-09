package ConditionalStatements;
import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = input.nextInt();

        System.out.print("Enter another number:");
        int num2 = input.nextInt();

        if (num == num2) {
            System.out.print("The numbers are equal");
        } else if (num > num2){
            System.out.print("The first number is larger than the second");
        } else {
            System.out.print("The second number is larger than the first");
        }

    }
}
