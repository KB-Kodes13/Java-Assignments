package PracticingLoops;
import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number less than 11: ");
            num = input.nextInt();

            if (num >= 11) {
                System.out.println("Error, number must be less than 11");
            }
        } while (num >= 11) ;
            for (int i = num; i <= 11; i++) {
                System.out.println(i + " ");
            }
            System.out.println();
        }

    }

