package com.example.Movies.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Movies.Entity.Review;
import com.example.Movies.Repository.ReviewRepository;
import com.example.Movies.Repository.CommentRepository;


@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private CommentRepository commentRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    public Review saveReview(Review review) {
        Review savedReview = reviewRepository.save(review);
        // Save a comment when a review is created for a movie
        if (review.getComment() != null && review.getUser() != null && review.getMovie() != null) {
            com.example.Movies.Entity.Comment comment = new com.example.Movies.Entity.Comment();
            comment.setText(review.getComment());
            comment.setUser(review.getUser());
            comment.setMovie(review.getMovie());
            comment.setReview(savedReview);
            commentRepository.save(comment);
        }
        return savedReview;
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
