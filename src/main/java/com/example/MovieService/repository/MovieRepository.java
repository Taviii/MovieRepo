package com.example.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MovieService.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
}
