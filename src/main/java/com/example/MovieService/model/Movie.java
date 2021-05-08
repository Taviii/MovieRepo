package com.example.MovieService.model;

public class Movie {
    private Long id;
    private String name;
    private  enum category{horror, comedy, fantasy, romance};
    private int rating;

    public Movie(Long id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
