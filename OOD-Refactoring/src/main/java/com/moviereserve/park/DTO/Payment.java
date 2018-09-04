package com.moviereserve.park.DTO;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Payment {
	private Long paymentId;
	private Timestamp paymentDate;
	private Integer cost;
}
