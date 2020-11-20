package com.company.Problem8;

public class Movie {
    private final String title;
    private final int rating;

    public Movie( String name, int rating ) {
        this.title = name;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}
