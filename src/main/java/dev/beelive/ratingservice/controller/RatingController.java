package dev.beelive.ratingservice.controller;

import dev.beelive.ratingservice.entities.Rating;
import dev.beelive.ratingservice.services.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    private RatingService ratingService;
    @GetMapping("/create")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }


}
