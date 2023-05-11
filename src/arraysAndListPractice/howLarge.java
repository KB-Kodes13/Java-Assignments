package arraysAndListPractice;
import java.util.Scanner;
import java.util.ArrayList;
public class howLarge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<String> ();

        System.out.println(" Enter a few words:");
          while(true) {
              String word = input.nextLine();
              stringList.add(word);

              if(word.isEmpty()) {
                  System.out.println("The total amount of items in the list was: " + (stringList.size()-1));
                  break;
              }
          }
    }
}
