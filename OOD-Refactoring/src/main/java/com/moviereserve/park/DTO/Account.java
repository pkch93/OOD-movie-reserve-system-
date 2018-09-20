package com.moviereserve.park.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Account {
	private String accountId;
	private String accountPw;
	private String accountName;
	private Integer age;
	private String phone;
	private String address;
	private boolean isAdmin;
}
