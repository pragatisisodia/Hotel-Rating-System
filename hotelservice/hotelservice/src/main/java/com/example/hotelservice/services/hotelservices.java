package com.example.hotelservice.services;

import com.example.hotelservice.models.hotel;
import com.example.hotelservice.repositories.hotelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class hotelservices {
    @Autowired
    private hotelrepo hotel_rep;
    public List get_all_hotel_details() {
        return hotel_rep.findAll();

    }

    public Optional<hotel> get_single_hotel(int hotel_id) {
        return hotel_rep.findById(hotel_id);
    }

    public String add_hotel(hotel h) {
        System.out.println(h.getHotel_name());
        hotel_rep.save(h);
        return "successfully added hotel details";
    }

    public String delete_hotel(int hotelId) {
        hotel_rep.deleteById(hotelId);
        return "Successfully deleted given hotel";
    }
}
