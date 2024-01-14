package com.example.hotelservice.controller;

import com.example.hotelservice.models.hotel;
import com.example.hotelservice.services.hotelservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class hotelcon {
    @Autowired
    private hotelservices hotel_ser;
    @GetMapping("/get_all_hotel_details")
    public List get_all_hotel_details()
    {
        return hotel_ser.get_all_hotel_details();
    }
    @GetMapping("/get_single_hotel/{hotel_id}")
    public Optional<hotel> get_single_hotel(@PathVariable int hotel_id)
    {
        return hotel_ser.get_single_hotel(hotel_id);
    }
    @PostMapping("/add_hotel")
    public String add_hotel(@RequestBody hotel h)
    {
        return hotel_ser.add_hotel(h);
    }
    @DeleteMapping("/delete_hotel")
    public String delete_hotel(@PathVariable int hotel_id)
    {
        return hotel_ser.delete_hotel(hotel_id);
    }

}
