package dev.beelive.ratingservice.serviceImpl;

import dev.beelive.ratingservice.entities.Rating;
import dev.beelive.ratingservice.repositories.RatingRepository;
import dev.beelive.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    RatingRepository ratingRepository;

    @Autowired
    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }



    @Override
    public Rating create(Rating rating) {
        UUID uuid = UUID.randomUUID();
        rating.setRatingID(uuid.toString());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserID(String userID) {
        return ratingRepository.findByUserID(userID);
    }

    @Override
    public List<Rating> getRatingByHotelID(String hotelID) {
        return ratingRepository.findByHotelID(hotelID);
    }
}
