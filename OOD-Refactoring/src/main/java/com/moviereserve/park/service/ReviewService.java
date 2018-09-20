package com.moviereserve.park.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereserve.park.DAO.ReviewDAO;
import com.moviereserve.park.DTO.Review;

@Service
public class ReviewService {
	
	ReviewDAO reviewDAO;
	
	@Autowired
	public ReviewService(SqlSession sqlSession) {
		// TODO Auto-generated constructor stub
		this.reviewDAO = sqlSession.getMapper(ReviewDAO.class);
	}
	
	// 리뷰 작성
	public void create(String reviewTitle, String content, String accountId, Integer movieId) {
		reviewDAO.create(reviewTitle, content, accountId, movieId);
	}
	
	// 리뷰 조회	
	public Review read(Integer movieId, Integer reviewId) {
		hitup(reviewId);
		return reviewDAO.read(movieId, reviewId);
	}
	
	
	// 리뷰 수정
	public void update() {
		
	}
	
	// 리뷰 삭제
	public void delete(Integer reviewId) {
		reviewDAO.delete(reviewId);
	}
	
	// 추천수 증가
	public void recommendUp(Integer reviewId) {
		reviewDAO.recommendUp(reviewId);
	}
	
	// 조회수 증가
	public void hitup(Integer reviewId) {
		reviewDAO.hitUp(reviewId);
	}
	
	public List<Review> reviewList(Integer movieId){
		return reviewDAO.reviewList(movieId);
	}
	
	
}
