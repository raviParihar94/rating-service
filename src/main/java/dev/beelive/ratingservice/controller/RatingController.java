package dev.beelive.ratingservice.controller;

import dev.beelive.ratingservice.entities.Rating;
import dev.beelive.ratingservice.services.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    private RatingService ratingService;
    @PostMapping("/create-rating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping("/getall-ratings")
    public ResponseEntity<List<Rating>> getAllRatings(){

        return ResponseEntity.ok(ratingService.getAllRatings());
    }
    @GetMapping("/user/{userID}")
    public ResponseEntity<List<Rating>> getAllRatingsByUserID(@PathVariable String userID){
        return ResponseEntity.ok(ratingService.getRatingByUserID(userID));
    }
    @GetMapping("/hotels/{hotelID}")
    public ResponseEntity<List<Rating>> getAllRatingsByHotelID(@PathVariable  String hotelID){
        return ResponseEntity.ok(ratingService.getRatingByHotelID(hotelID));
    }
}

