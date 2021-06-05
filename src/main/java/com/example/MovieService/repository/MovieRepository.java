package com.example.MovieService.repository;

import com.example.MovieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Long Long);

    @Override
    Movie save(Movie movie);

    @Override
    void delete(Movie movie);
}
