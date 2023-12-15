package dev.beelive.ratingservice.services;

import dev.beelive.ratingservice.entities.Rating;

import java.util.List;

public interface RatingService {

    /*create rating*/
    Rating create(Rating rating);


    /*get all ratings*/

    List<Rating> getAllRatings();



    /*getAll rating by UserID */
    List<Rating> getRatingByUserID(String userID);


    /*get all rating by Hotel id*/
    List<Rating>getRatingByHotelID(String hotelID);

}
