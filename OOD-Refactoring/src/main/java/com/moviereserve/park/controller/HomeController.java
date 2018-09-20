package com.moviereserve.park.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.moviereserve.park.DAO.AccountDAO;
import com.moviereserve.park.DTO.Movie;
import com.moviereserve.park.service.AccountService;
import com.moviereserve.park.service.MovieService;

@Controller
public class HomeController {
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Movie> popularMovies = movieService.getMovieList();
		List<Movie> recentMovies = movieService.getMovieList();
		model.addAttribute(popularMovies);
		model.addAttribute(recentMovies);
		return "index";
	}
	// 초기 페이지
	
	@GetMapping("/reserve")
	public String reserve() {
		return "reserve";
	}
	// 예매 페이지
	
	@PostMapping("/searchResult")
	public String searchResult(HttpServletRequest request, Model model) {
		String queryString = request.getParameter("queryString");
		System.out.println(queryString);
		List<Movie> searchResult = movieService.movieSearch(queryString);
		model.addAttribute("searchResult", searchResult);
		return "searchresult";
	}
	// 영화 검색 결과 페이지	
}
