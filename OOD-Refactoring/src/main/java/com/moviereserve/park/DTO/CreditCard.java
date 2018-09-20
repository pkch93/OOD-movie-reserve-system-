package com.moviereserve.park.DTO;

import lombok.Data;

@Data
public class CreditCard {
	private Long creditCardId;
	private String company;
	private Integer cost;
	private Long paymentId;
}
