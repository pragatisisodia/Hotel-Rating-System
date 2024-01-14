package com.rating.ratings.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class rating {
    @Id
    private int ratingId;
    private int userId;
    private int hotelId;
    private int rating;
    private String feedback;

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public rating(int ratingId, int userId, int hotelId, int rating, String feedback) {
        this.ratingId = ratingId;
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.feedback = feedback;
    }

    public rating() {
    }

    @Override
    public String toString() {
        return "rating{" +
                "rating_id=" + ratingId +
                ", user_id=" + userId +
                ", hotel_id=" + hotelId +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
