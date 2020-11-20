package com.company.Problem8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Movie[] movies = new Movie[10];

        for (int i = 0; i < movies.length; i++) {
            String title = scanner.nextLine();
            Movie movie = new Movie(title, random.nextInt(10));
            movies[i] = movie;
        }

        for (int i = 0; i < movies.length; i++) {
            for (int j = 0; j < movies.length - i - 1; j++) {
                if (movies[j].getRating() < movies[j + 1].getRating()) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }

        int maxRating = movies[0].getRating();
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if (movies[i].getRating() == maxRating) {
                System.out.println((i + 1) + ". " + "Title - " + movie.getTitle() + ", Rating - " + movie.getRating());
            }
        }
    }
}
