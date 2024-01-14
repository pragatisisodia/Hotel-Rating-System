package com.microservices.user_service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class rating {
    private int rating_id;
    private int user_id;
    private int hotel_id;
    private int rating;
    private String feedback;
    private hotel hotel_de;

    public int getRating_id() {
        return rating_id;
    }

    public void setRating_id(int rating_id) {
        this.rating_id = rating_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
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

    public hotel getHotel_de() {
        return hotel_de;
    }

    public void setHotel_de(hotel hotel_de) {
        this.hotel_de = hotel_de;
    }

    public rating(int rating_id, int user_id, int hotel_id, int rating, String feedback, hotel hotel_de) {
        this.rating_id = rating_id;
        this.user_id = user_id;
        this.hotel_id = hotel_id;
        this.rating = rating;
        this.feedback = feedback;
        this.hotel_de = hotel_de;
    }

    public rating() {
    }

    @Override
    public String toString() {
        return "rating{" +
                "rating_id=" + rating_id +
                ", user_id=" + user_id +
                ", hotel_id=" + hotel_id +
                ", rating=" + rating +
                ", feedback='" + feedback + '\'' +
                ", hotel_de=" + hotel_de +
                '}';
    }
}
