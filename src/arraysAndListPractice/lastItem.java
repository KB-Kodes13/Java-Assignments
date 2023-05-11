package arraysAndListPractice;
import java.util.Scanner;
import java.util. ArrayList;
public class lastItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<String>();

        System.out.println(" Enter a few words:");
        while(true) {
            String word = input.nextLine();
            stringList.add(word);
            if (word.isEmpty() || word == null) {
                System.out.println("The last item in the list is: " + stringList.get(stringList.size() - 2));
                break;
            }
        }
    }
}
