package com.example.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Movies.Entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
