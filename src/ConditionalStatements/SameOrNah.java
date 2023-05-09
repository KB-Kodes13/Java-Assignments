package ConditionalStatements;
import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Word:");
        String word = input.nextLine();

        System.out.println("Enter another Word:");
        String word2 = input.nextLine();

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are NOT the same");
        }
    }
}
