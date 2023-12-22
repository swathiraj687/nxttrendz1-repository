/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.model.Product;

import java.util.ArrayList;

public interface ReviewRepository {
    ArrayList<Review> getReviews();

    Review getReviewById(int reviewId);

    Review addReview(Review review);

    void deleteReview(int reviewId);

    Review updateReview(int reviewId, Review review);





}
