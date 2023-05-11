package arraysAndListPractice;
import java.util.Scanner;
import java.util. ArrayList;
public class indexOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        System.out.println("Enter a few numbers:");

        while(true) {
            int num = input.nextInt();
            intArray.add(num);

            if(num == 0) {
                System.out.println("Done entering integers into the list ");
                System.out.println("What number are you looking for in the list?");
                int num2 = input.nextInt();
                System.out.println(num2 + " is at index " + intArray.indexOf(num2));
                break;
            }
        }
    }
}
