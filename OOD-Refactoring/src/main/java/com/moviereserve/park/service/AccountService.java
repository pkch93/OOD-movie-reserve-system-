package com.moviereserve.park.service;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereserve.park.DAO.AccountDAO;
import com.moviereserve.park.DTO.Account;

@Service
public class AccountService{
	
	AccountDAO accountDAO;
	
	@Autowired
	public AccountService(SqlSession sqlSession) {
		accountDAO = sqlSession.getMapper(AccountDAO.class);
	}
	
	// 회원가입
	public void join(String accountId, String accountPw, String accountName,
		Integer age, String phone, String address, boolean isAdmin) {
		accountDAO.create(accountId, accountPw, accountName, age, phone, address, isAdmin);
	}
	
	// 회원조회
	public Account read(String accountId) {
		return accountDAO.read(accountId);
	}
	
	// 회원 탈퇴
	public void exit(String id) {
		accountDAO.delete(id);
	}
	
	// 회원정보수정
	public void update() {
		
	}
	
	
}
