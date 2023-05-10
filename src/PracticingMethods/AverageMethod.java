package PracticingMethods;
import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        int sum = sumOfNums(num, num2, num3);
        double answer = averageOfNums(sum);
        System.out.println("The average number is:" + answer);
    }
    public static int sumOfNums(int num, int num2, int num3) {
        int total = num + num2 + num3;
        return total;
    }
    public static double averageOfNums(int sum) {
        double average = sum / 3.0;
        return average;
    }
}
