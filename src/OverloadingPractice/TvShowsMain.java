package OverloadingPractice;

import java.util.Scanner;
import java.util.ArrayList;
public class TvShowsMain {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      ArrayList<TvShows> tvShows = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of a TV show (or nothing to stop the loop): ");
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int episodes = Integer.parseInt(input.nextLine());

            System.out.print("Enter the genre: ");
            String genre = input.nextLine();

            System.out.print("How many main cast members are there: ");
            int mainCast = Integer.parseInt(input.nextLine());

            System.out.print("How many seasons are available: ");
            int seasons = Integer.parseInt(input.nextLine());

            TvShows tvShow = new TvShows(name, episodes, genre, mainCast, seasons);
            tvShows.add(tvShow);
        }

        for (TvShows tvShow : tvShows) {
            System.out.println(tvShow.toString());
        }
    }
}
