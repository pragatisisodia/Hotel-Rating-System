package com.microservices.user_service.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
public class user {
    @Id
    private int user_id;
    private String user_name;
    private String user_phone_no;
    private String user_email;

    @Transient
    private List<rating> ratings;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone_no() {
        return user_phone_no;
    }

    public void setUser_phone_no(String user_phone_no) {
        this.user_phone_no = user_phone_no;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public List<rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<rating> ratings) {
        this.ratings = ratings;
    }

    public user(int user_id, String user_name, String user_phone_no, String user_email, List<rating> ratings) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_phone_no = user_phone_no;
        this.user_email = user_email;
        this.ratings = ratings;
    }

    public user() {
    }

    @Override
    public String toString() {
        return "user{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_phone_no='" + user_phone_no + '\'' +
                ", user_email='" + user_email + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
