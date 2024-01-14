package com.microservices.user_service.controller;

import com.microservices.user_service.entities.user;
import com.microservices.user_service.services.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class user_controller {
    @Autowired
    private user_service user_ser;
 //   @GetMapping("/get_user_details/{user_id}")
   // public Optional<user> Userdetails(@PathVariable int user_id)
 @GetMapping("/get_user_details/{user_id}")
         public user Userdetails(@PathVariable int user_id)
    {
        user u=user_ser.Userdetails(user_id);
        //Optional<user> u=user_ser.Userdetails(user_id);

        return u;
    }
    @GetMapping("/get_all_details")
    public List<user> Userall()
    {
        return user_ser.Userall();
    }
    @PostMapping("/save_user_details")
    public String save_user(@RequestBody user u)
    {
        return user_ser.save_user(u);
    }
    @DeleteMapping("/delete_user/{id}")
    public String delete_user(@PathVariable int id)
    {
        return user_ser.delete_user(id);
    }
}
