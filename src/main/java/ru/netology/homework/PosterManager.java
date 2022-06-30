package ru.netology.homework;

import java.nio.file.attribute.PosixFileAttributes;

public class PosterManager {
    protected String[] movies = new String[0];
    protected int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager () {
        limit = 10;
    }

    public void add(String film) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] ans = new String[resultLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = movies [movies.length - i - 1];
        }
        return ans;
    }
}
