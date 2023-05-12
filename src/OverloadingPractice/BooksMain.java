package OverloadingPractice;
import objectsInList.Book;

import java.util.ArrayList;
import java.util.Scanner;
public class BooksMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a book: (or nothing to stop the loop)");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many pages does the book have? ");
            int pages = input.nextInt();
            input.nextLine(); // consume the newline character

            System.out.println("What year was the book published? ");
            int year = input.nextInt();
            input.nextLine(); // consume the newline character

            System.out.println("Who is the author?");
            String author = input.nextLine();

            System.out.println("What is the current price of the book?");
            double price = input.nextDouble();
            input.nextLine(); // consume the newline character

            Books newInput = new Books(name, pages, year, author, price);
            book.add(newInput);

        }

        System.out.println("What would you like to print? (name/everything)");
        String printOption = input.nextLine();

        for (Books books : book) {
            if (printOption.equals("name")) {
                System.out.println(books.getTitle());
            } else if (printOption.equals("everything")) {
                System.out.println(book.toString());
            } else {
                System.out.println("Invalid input.");
                break;
            }
        }

    }
}
