package com.moviereserve.park.DTO;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Screen {
	private Long screenId;
	private Long movieId;
	private Long cinemaId;
	private Long theaterId;
	private Timestamp watchTime;
}
