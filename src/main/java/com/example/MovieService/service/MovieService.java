package com.example.MovieService.service;

import com.example.MovieService.model.Category;
import com.example.MovieService.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> findAllMovies(){
        return List.of(
                new Movie(1L, "Sesja lato 2k21", Category.Horror, 5),
                new Movie(2L, "Love", Category.SciFi, 8),
                new Movie(3L, "Zdany JAZ", Category.Fantasy, 9)
        );
    }

    public Movie findMovieById(Long id){
        return new Movie(4L, "5 z JAZu", Category.Drama, 5);
    }

    public Movie addNewMovie(Movie movie){
        return movie;
    }

    public Movie updateMovie(Movie movie, Long id){
        return new Movie(id, movie.getName(), movie.getCategory(), movie.getRating());
    }

    public void deleteMovie(Long id){
        System.out.println("Movie has been deleted");
    }
}

