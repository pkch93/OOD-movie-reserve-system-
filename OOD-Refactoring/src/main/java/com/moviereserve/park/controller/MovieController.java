package com.moviereserve.park.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moviereserve.park.DTO.Movie;
import com.moviereserve.park.DTO.Review;
import com.moviereserve.park.service.MovieService;
import com.moviereserve.park.service.ReviewService;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	ReviewService reviewService;
	
	@GetMapping("/{movieId}")
	public String movieDetail(@PathVariable Integer movieId, Model model) {
		Movie movie = movieService.getMovie(movieId);
		model.addAttribute("movie", movie);
		return "movie/movie";
	} // 영화 상세 조회
	
	@GetMapping("/{movieId}/review")
	public String reviewList(@PathVariable Integer movieId, Model model) {
		List<Review> reviewList = reviewService.reviewList(movieId);
		model.addAttribute("reviewList", reviewList);
		return "movie/reviewlist";
	} // 해당 영화의 전체 리뷰 목록
	
	@PostMapping("/{movieId}/review")
	public String createReview(HttpServletRequest request, @PathVariable Integer movieId, Model model) {
		
		return "";
	} // 리뷰 생성
	
	@GetMapping("/{movieId}/review/{reviewId}")
	public String reviewDetail(@PathVariable Integer movieId, @PathVariable Integer reviewId, Model model) {
		Review review = reviewService.read(movieId, reviewId);
		model.addAttribute("review", review);
		return "movie/review";
	} // 리뷰 상세 조회
	
	@DeleteMapping("/{movieId}/review/{reviewId}")
	public String deleteReview(@PathVariable Integer reviewId) {
		reviewService.delete(reviewId);
		return "redirect:/movie/{movieId}";
	} // 리뷰 삭제
}
