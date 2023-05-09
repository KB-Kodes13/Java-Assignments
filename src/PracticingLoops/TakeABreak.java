package PracticingLoops;
import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String answer = input.nextLine();
            if (answer.equals("yes")) {
                break;
            }
        }

        System.out.println(("Have a nice break!"));
        }
    }

