package com.moviereserve.park.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	// 초기 페이지
	
	@GetMapping("/reserve")
	public String reserve() {
		return "reserve";
	}
	// 예매 페이지
	
	@PostMapping("/searchresult")
	public String searchResult(HttpServletRequest request) {
		return "searchresult";
	}
	// 영화 검색 결과 페이지
	
	
}
