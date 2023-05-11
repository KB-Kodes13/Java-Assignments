package chatBot;
import java.util.Scanner;
public class chatBotProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        greeting();

        String name = askName(input);

        int age = guessAge(input);

        countToNumber(input);

        testProgrammingKnowledge(input);

        farewell(name);

        input.close();
    }

    public static void greeting() {
        System.out.println("Hello! I am your chat bot. How can I assist you today?");
    }

    public static String askName(Scanner input) {
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
        return name;
    }

    public static int guessAge(Scanner input) {
        System.out.println("I'm not great at guessing. Can you tell me your age?");
        int ageGuess = input.nextInt();
        input.nextLine();
        int age = ageGuess + 5;
        System.out.println("Based on my historic calculations, humans are known for lying, specifically about age, you are probably " + age + " years old!");
        return age;
    }

    public static void countToNumber(Scanner input) {
        System.out.println("Pick a number and I will count up to it!");
        int countTo = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= countTo; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge(Scanner input) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the purpose of a loop?");
        System.out.println("a. To repeat a statement multiple times");
        System.out.println("b. To store a group of values");
        System.out.println("c. To perform mathematical operations");
        System.out.println("d. To define a block of code");
        String answer = input.nextLine();
        while (!answer.equals("a")) {
            System.out.println("Sorry, that's incorrect. Try again!");
            answer = input.nextLine();
        }
        System.out.println("Congratulations, you got it right!");
    }

    public static void farewell(String name) {
        System.out.println("Goodbye, " + name + "! Thanks for chatting with me today!");
    }

}
