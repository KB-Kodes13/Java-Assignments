package OverloadingPractice;

public class Books {
    private String title;
    private int pages;
    private int year;
    private String author;
    private double price;

    public Books(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    public Books(String title, int pages, int year, String author, double price) {
        this.title = title;
        this.pages = pages;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return title + " has " + pages + " pages. This book was published in " + year + " by " + author + ". The current sales price for tis book is $" + price;
    }
}
