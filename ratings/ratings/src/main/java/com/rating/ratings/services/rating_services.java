package com.rating.ratings.services;

import com.rating.ratings.models.rating;
import com.rating.ratings.reating.rating_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class rating_services {
    @Autowired
    private rating_repo rating_rep;
    public List<rating> get_all_rating_details() {
        return rating_rep.findAll();
    }

    public String create_rating(rating r) {
        rating_rep.save(r);
        return "Successfully created";

    }

    public List<rating> findAllByuserid(int userId) {
        return (List<rating>)rating_rep.findByUserId(userId);
    }
    public List<rating> findAllByhotelid(int hotelId) {
        return (List<rating>)rating_rep.findByUserId(hotelId);
    }
}
