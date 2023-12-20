package com.lcwd.rating.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.entities.Rating;
import com.lcwd.rating.repository.RatingRepository;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	public Rating create(Rating rating) {
		
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		
		return ratingRepository.save(rating);
	}
	
	public List<Rating> getAllRating() {
		return ratingRepository.findAll();
	}
	
	public List<Rating> getRatingByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}
	
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}
}
