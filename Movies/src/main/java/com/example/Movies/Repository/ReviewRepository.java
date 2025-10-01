package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Movies.Entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    
}
