package com.moviereserve.park.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moviereserve.park.DTO.Account;
import com.moviereserve.park.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
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
	
	@PostMapping("/usermanage")
	public String createAccount(HttpServletRequest request) {
		return "redirect:/park/";
	}
	
	@PatchMapping("/usermanage/{accountId}")
	public String updateAccount(@PathVariable String accountId) {
		return "";
	} // 회원정보 수정
	
	@GetMapping("/usermanage/{accountId}")
	public String userManage(@PathVariable String accountId, Model model) {
		Account account = accountService.read(accountId);
		model.addAttribute(account);
		return "accountmanage/usermanage";
	}
	// 회원 수정 및 조회
	
	@DeleteMapping("/usermanage/{accountId}")
	public String exit(@PathVariable String accountId) {
		accountService.exit(accountId);
		return "redirect:/";
	}
	// 회원 탈퇴
	
	@GetMapping("/reserveList/{accountId}")
	public String useList(@PathVariable Integer accountId, @RequestParam(defaultValue="3") Integer month) {
		return "accountmanage/reservelist";
	}
	// 회원의 사용내역 (기간에 따라 사용내역을 알려줌, 기본값은 3개월 간)
}	
