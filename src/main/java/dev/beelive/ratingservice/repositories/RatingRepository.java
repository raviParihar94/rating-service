package dev.beelive.ratingservice.repositories;

import dev.beelive.ratingservice.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {
List<Rating> findByUserID(String userID);
List<Rating> findByHotelID(String userID);



}
