package com.moviereserve.park.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Seat {
	private Long seatNum;
	private boolean reserve;
	private Long theaterId;
}
