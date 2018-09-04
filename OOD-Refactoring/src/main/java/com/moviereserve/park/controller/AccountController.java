package com.moviereserve.park.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AccountController {
	
	@GetMapping("/login")
	public String login() {
		return "accountmanage/login";
	}
	// 로그인 페이지
	
	@GetMapping("/join")
	public String join() {
		return "accountmanage/join";
	} 
	// 회원가입 페이지
	
	@GetMapping("/find")
	public String find() {
		return "accountmanage/find";
	}
	// 아이디 & 비밀번호 찾기
	
	@GetMapping("/uselist/{accountId}")
	public String useList(@PathVariable Long accountId) {
		return "uselist";
	}
	// 회원의 사용내역
	
	@GetMapping("/usermanage/{accountId}")
	public String userManage(@PathVariable Long accountId) {
		return "usermanage";
	}
	// 회원 수정 및 조회
}	
