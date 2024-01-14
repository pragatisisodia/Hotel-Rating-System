package com.microservices.user_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class hotel {
    @Id
    private int hotel_id;
    private String hotel_name;
    private String hotel_location;
    private String hotel_about;

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_location() {
        return hotel_location;
    }

    public void setHotel_location(String hotel_location) {
        this.hotel_location = hotel_location;
    }

    public String getHotel_about() {
        return hotel_about;
    }

    public void setHotel_about(String hotel_about) {
        this.hotel_about = hotel_about;
    }

    public hotel(int hotel_id, String hotel_name, String hotel_location, String hotel_about) {
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.hotel_location = hotel_location;
        this.hotel_about = hotel_about;
    }

    public hotel() {
    }

    @Override
    public String toString() {
        return "hotel{" +
                "hotel_id=" + hotel_id +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_location='" + hotel_location + '\'' +
                ", hotel_about='" + hotel_about + '\'' +
                '}';
    }
}
