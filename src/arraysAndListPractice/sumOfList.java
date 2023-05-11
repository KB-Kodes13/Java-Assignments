package arraysAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class sumOfList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter a number: ");

        while(true) {
            int text = input.nextInt();
            numbers.add(text);

            int sum = 0;
            for(int i = 0; i < numbers.size(); i++){
                sum += numbers.get(i);

            }

            if(text == 0) {
                numbers.remove(numbers.get(numbers.size()-1));
                System.out.print(numbers.toString().replace("[","").replace("]","") + " were the items in the list. ");

                System.out.println("The sum of the list is: " + sum);
                break;
            }
        }

    }

}
