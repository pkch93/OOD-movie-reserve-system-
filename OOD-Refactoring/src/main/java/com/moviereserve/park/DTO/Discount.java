package com.moviereserve.park.DTO;

import lombok.Data;

@Data
public class Discount{
	private Long discountId;
	private String method;
	private Integer discountCost;
	private Long paymentId;
}
