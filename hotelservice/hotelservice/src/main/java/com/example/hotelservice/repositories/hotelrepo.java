package com.example.hotelservice.repositories;

import com.example.hotelservice.models.hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface hotelrepo extends JpaRepository<hotel,Integer> {
}
