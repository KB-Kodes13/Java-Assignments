package PracticingMethods;
import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a number");
        int num = input.nextInt();

        System.out.print("Choose another number");
        int num2 = input.nextInt();


        double num3 = divide(num, num2 );
        System.out.println(num + " / " + num2 + " = " + num3);



    }
    public static double divide(double num, double num2) {
        double result = num / num2;
        return result;

    }
}
