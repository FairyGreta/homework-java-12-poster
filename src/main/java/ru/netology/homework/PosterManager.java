package ru.netology.homework;
import ru.netology.repository.PosterRepository;

public class PosterManager {
    private PosterRepository repo;
    protected int limit;

    public PosterManager(PosterRepository repo, int limit) { // исправила
        this.repo = repo;
        this.limit = limit;
    }

    public PosterManager(PosterRepository repo) { // исправила
        this.repo = repo;
        limit = 10;
    }

    public void add(Poster movie) {
        repo.save(movie);
    }

    public void findById(int id) { // менеджер использует функционал из репозитория
        repo.findById(id);
    }

    public void removeById(int id) { // менеджер использует функционал из репозитория
        repo.removeById(id);
    }

    public void removeAll(Poster[] movies) { // менеджер использует функционал из репозитория
        repo.removeAll(movies);
    }

    public Poster[] findAll() {
        Poster[] movies = repo.findAll();
        return movies;
    }

    public String[] findLast() {
        Poster[] movies = new Poster[0];
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] ans = new String[resultLength];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = String.valueOf(movies[movies.length - i - 1]);
        }
        return ans;
    }
}
