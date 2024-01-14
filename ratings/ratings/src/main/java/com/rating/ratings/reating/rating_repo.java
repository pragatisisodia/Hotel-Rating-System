package com.rating.ratings.reating;

import com.rating.ratings.models.rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface rating_repo extends JpaRepository<rating,Integer> {
    List<rating> findByUserId(int userId);
    List<rating> findByHotelId(int hotelId);

   // Object findAllByuserid(int userId);
    // List<rating> findbyhotelid(int hotel_id);
}
