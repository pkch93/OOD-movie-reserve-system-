package com.moviereserve.park.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviereserve.park.DTO.Review;

@Repository
public interface ReviewDAO {
	public List<Review> reviewList(); 
	public void create(String reviewTitle);
	public Review read(Long reviewId);
	public void update();
	public void delete(Long reviewId);
	public void hitUp(Long reviewId);
	public void recommendUp(Long reviewId);
}
