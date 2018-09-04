package com.moviereserve.park.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Theater {
	private Long theaterId;
	private Integer seatAmount;
}
