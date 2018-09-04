package com.moviereserve.park.DAO;

import org.springframework.stereotype.Repository;

import com.moviereserve.park.DTO.Account;

@Repository
public interface AccountDAO {
	public void create(String accountId, String accountPw,
			String accountName,	String phone, String address, boolean isAdmin);
	public Account read(String accountId);
	public void update(String accountPw, String phone, String address);
	public void delete(String accountId);
}
