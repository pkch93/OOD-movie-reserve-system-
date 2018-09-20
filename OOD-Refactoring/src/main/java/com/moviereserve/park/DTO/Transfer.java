package com.moviereserve.park.DTO;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Transfer {
	private Long transferId;
	private String bank;
	private Timestamp deadline;
	private Integer cost;
	private Long paymentId;
}
