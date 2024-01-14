package com.microservices.user_service.services;

import com.microservices.user_service.entities.hotel;
import com.microservices.user_service.entities.rating;
import com.microservices.user_service.entities.user;
import com.microservices.user_service.repositories.user_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class user_service {
    @Autowired
    private user_repo user_rep;
    @Autowired
    private RestTemplate restTemplate;
    public user Userdetails(int user_id)
    {
        ///hotel/get_single_hotel/{hotel_id}
         user u=user_rep.findById(user_id).orElseThrow();
        rating[] ratingsofUser=restTemplate.getForObject("http://RATING-SERVICE/rating/getByUserId/"+u.getUser_id(),rating[].class);
       List<rating>ratings=Arrays.stream(ratingsofUser).toList();

        List<rating>ratingList=ratings.stream().map(rat->{
          ResponseEntity<hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/hotel/get_single_hotel/"+rat.getHotel_id(),hotel.class);
          hotel h=forEntity.getBody();
          rat.setHotel_de(h);
          return rat;
       }).collect(Collectors.toList());

        u.setRatings(ratingList);
        return u;









        /*user u=user_rep.findById(user_id).orElseThrow();
        ArrayList<rating>ratingsofUser=restTemplate.getForObject("http://RATING-SERVICE/rating/getByUserId/"+u.getUser_id(), ArrayList.class);
        u.setRatings(ratingsofUser);
        return u;*/






       /* user u=user_rep.findById(user_id).orElseThrow();
       // Optional<user> u =user_rep.findById(user_id);
       rating[] a= restTemplate.getForObject("http://RATING-SERVICE/rating/getByUserId/"+u.getUser_id(), rating[].class);


       List<rating>ratings=Arrays.stream(a).toList();


       List<rating>ratinglist=ratings.stream().map(rating->{
          hotel h= restTemplate.getForObject("http://HOTEL-SERVICE/hotel/get_single_hotel/"+rating.getHotel_id(), hotel.class);
           rating.setHotel_de(h);

           return rating;

       }).collect(Collectors.toList());

       u.setRatings(ratings);
       return Optional.of(u);*/

    }

    public List<user> Userall() {
        return user_rep.findAll();
    }

    public String save_user(user u) {
        System.out.println(u);
        user_rep.save(u);
        return "Succesfully savedd";
    }

    public String delete_user(int id) {
        user_rep.deleteById(id);
        return "Succesfully deleted";
    }
}
