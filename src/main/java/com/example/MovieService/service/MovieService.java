package com.example.MovieService.service;

import com.example.MovieService.model.Movie;
import com.example.MovieService.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            return movie;
        } else {
            throw new RuntimeException();
        }
    }

    public Movie addNewMovie(Movie movie) {
        return movie;
    }

    public Movie updateMovie(Movie movie, Long id) {
        return new Movie(id, movie.getName(), movie.getCategory(), movie.getRating());
    }

    public void deleteMovie(Long id) {
        System.out.println("Movie has been deleted");
    }

    public boolean isAvailable(Long id) {
        Movie movie = movieRepository.findById(id).get();
        movie.setAvailable(true);
        return movie.isAvailable();
    }
}

