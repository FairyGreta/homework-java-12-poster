package ru.netology.homework;

import java.util.SplittableRandom;

public class Poster {
    private int id;
    private int productId;
    private String movieName;
    private String genre;
    private String ageMarking;
    private String releaseDate;

    public Poster(int id, int productId, String movieName, String genre, String ageMarking, String releaseDate) {
        this.id = id;
        this.productId = productId;
        this.genre = genre;
        this.ageMarking = ageMarking;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public String getAgeMarking() {
        return ageMarking;
    }

    public void setAgeMarking(String ageMarking) {
        this.ageMarking = ageMarking;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
