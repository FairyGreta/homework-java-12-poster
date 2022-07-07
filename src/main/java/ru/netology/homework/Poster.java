package ru.netology.homework;

public class Poster {
    private int id;
    private String movieName;
    private String genre;
    private String releaseData;

    public Poster (int id, String movieName, String genre, String releaseData) {
        this.id = id;
        this.movieName = movieName;
        this.genre = genre;
        this.releaseData = releaseData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(String releaseData) {
        this.releaseData = releaseData;
    }
}
