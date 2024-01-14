package com.rating.ratings.controller;

import com.rating.ratings.models.rating;
import com.rating.ratings.services.rating_services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class rating_cont {
    @Autowired
    private rating_services rating_ser;

    @PostMapping("/create")
    public String create_rating(@RequestBody rating r)
    {
        return rating_ser.create_rating(r);
    }
    @GetMapping("/get")
    public List get_all_rating_details()
    {
        return rating_ser.get_all_rating_details();
    }

    @GetMapping("/getByUserId/{user_id}")
    public List get_rating_by_userid(@PathVariable int user_id)
    {
        return rating_ser.findAllByuserid(user_id);
    }
    @GetMapping("/getByHotelId/{hotel_id}")
    public List get_rating_by_hotelid(@PathVariable int hotel_id)
    {
        return rating_ser.findAllByuserid(hotel_id);
    }

}
