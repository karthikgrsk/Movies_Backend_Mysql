package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Movies.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // Add custom query methods if needed
}
