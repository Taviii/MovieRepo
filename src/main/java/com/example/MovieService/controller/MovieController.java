package com.example.MovieService.controller;

import com.example.MovieService.model.Movie;
import com.example.MovieService.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> findAllMovies() {
        return ResponseEntity.ok(movieService.findAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findMovieById(@PathVariable Long id){
        return ResponseEntity.ok(movieService.findMovieById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable Long id){
        movieService.updateMovie(movie, id);
        return ResponseEntity.ok(movie);
    }

    @PostMapping()
    public ResponseEntity<Movie> addNewMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addNewMovie(movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }

}
