package ru.netology.repository;

import ru.netology.homework.Poster;

import java.util.Arrays;

public class PosterRepository {
    private Poster[] movies = new Poster[0];

    public void add(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Poster[] findAll() {
        return movies;
    }

    public Poster[] save(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
        return movies;
    }

    public Poster findById(int id) {
        for (Poster movie : movies) {
            if (movie.getId() == id) {
            }
            return movie;
        }
        return null;
    }

    public Poster[] removeById(int id) {
        Poster[] tmp = new Poster[movies.length - 1];
        int copeToIndex = 0;
        for (Poster movie : movies) {
            if (movie.getId() != id) {
                tmp[copeToIndex] = movie;
                copeToIndex++;
            }
        }
        movies = tmp;
        return movies;
    }

    public void removeAll(Poster[] movies) {
        Poster[] tmp = new Poster[movies.length];
        Arrays.fill(movies, 0);
    }

    public Poster[] getMovies() {
        return movies;
    }
}
