package arraysAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class fifthItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<String> ();
        System.out.println("Enter at least 6 different words, then press enter twice:");
        while(true) {
            String word = input.nextLine();
            stringList.add(word);

            if(word.isEmpty() || word == null && stringList.size() > 4) {
                System.out.println("The fifth item in the list is:" + stringList.get(4));
                break;
            }
        }
    }


}
