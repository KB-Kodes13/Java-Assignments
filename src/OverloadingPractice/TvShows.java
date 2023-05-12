package OverloadingPractice;

public class TvShows {
    private String name;
    private int episodes;
    private String genre;
    private int mainCast;
    private int seasons;

    public TvShows(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }
    public TvShows(String name, int episodes, String genre,int mainCast, int seasons) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
        this.mainCast = mainCast;
        this.seasons = seasons;
    }

    public String getName() {

        return name;
    }

    public int getEpisodes() {

        return episodes;
    }

    public String getGenre() {

        return genre;
    }

    public int getMainCast() {
        return mainCast;
    }

    public int getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "The name of the show is " + name + " with " + episodes + " episodes. The genre is " + genre + ". There are " + mainCast + " main cast members on the show, and this show has been on for " + seasons + " seasons.";
    }
}
