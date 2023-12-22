/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.controller;

import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.model.Product;
import com.example.nxttrendz1.service.ReviewJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ReviewController {
    @Autowired
    private ReviewJpaService reviewJpaService;

    @GetMapping("/reviews/products")
    public ArrayList<Review> getReviews() {
        return reviewJpaService.getReviews();
    }

    @GetMapping("/reviews/products/{productId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId) {
        return reviewJpaService.getReviewById(reviewId);
    }

    @PostMapping("/products/reviews")
    public Review addReview(@RequestBody Review review) {
        return reviewJpaService.addReview(review);
    }

    @PutMapping("/products/reviews/{reviewId}")
    public Review updateReview(@PathVariable("reviewId") int reviewId, @RequestBody Review review) {
        return reviewJpaService.updateReview(reviewId, review);
    }

    @DeleteMapping("/products/reviews/{reviewId}")
    public void deleteReview(@PathVariable int reviewId) {
        reviewJpaService.deleteReview(reviewId);
    }

    @GetMapping("/reviews/{reviewId}/products")
    public Product getReviewProduct(@PathVariable int reviewId) {
        return reviewJpaService.getReviewProduct(reviewId);
    }
}
