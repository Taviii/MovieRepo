package com.example.MovieService.service;

import com.example.MovieService.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    public void throwException(String message) {
        throw new RuntimeException(message);
    }

//    public List<Movie> findAllMovies(){
//        return List.of(new Movie(1L, "Titanic", 3);
//        new Movie(1L, "Monster", 5);
//        new Movie(1L, "Killer", 2);
//        );
//        }

    public static List<Movie> getAllMovies() {
        Movie firstMovie = new Movie(1L, "Titanic", 3);
        Movie secondMovie = new Movie(1L, "Monster", 5);
        Movie thirdMovie = new Movie(1L, "Killer", 2);
        return List.of(
                firstMovie,
                secondMovie,
                thirdMovie
        );
    }
}

