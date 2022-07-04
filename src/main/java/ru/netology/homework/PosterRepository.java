package ru.netology.homework;

public class PosterRepository {

    protected Poster[] movies = new Poster[0];

    public void add(String film) {
        Poster [] tmp = new Poster [movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public void save(String movie) {
        String [] tmp = new String [movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    // найти фильм по ID
    public void findById(int id) {
        int search = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movie[i] == id) {
                tmp[search] = id;
            }

        }

        public void removeById ( int id){
            PurchaseItem[] tmp = new PurchaseItem[items.length - 1];
            int copyToIndex = 0;
            for (PurchaseItem item : items) {
                if (item.getId() != id) {
                    tmp[copyToIndex] = item;
                    copyToIndex++;
                }
            }
            items = tmp;
        }

        public String[] findLast () {
            int resultLength;
            if (movies.length < limit) {
                resultLength = movies.length;
            } else {
                resultLength = limit;
            }
            String[] ans = new String[resultLength];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = movies[movies.length - i - 1];
            }
            return ans;
        }

        public Poster[] getPoster() {

        }
    }
}
