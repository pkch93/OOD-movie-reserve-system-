package com.moviereserve.park.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviereserve.park.DTO.Review;

@Repository
public interface ReviewDAO {
	public List<Review> reviewList(Integer movieId); 
	public void create(String reviewTitle, String content, String accountId, Integer movieId);
	public Review read(Integer movieId,Integer reviewId);
	public void update();
	public void delete(Integer reviewId);
	public void hitUp(Integer reviewId);
	public void recommendUp(Integer reviewId);
}
