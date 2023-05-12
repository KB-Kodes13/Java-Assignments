package objectsInList;
import java.util.Scanner;
import java.util.ArrayList;
public class tvShowMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

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

            TvShow tvShow = new TvShow(name, episodes, genre);
            tvShows.add(tvShow);
        }

        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow.toString());
        }


    }
}
