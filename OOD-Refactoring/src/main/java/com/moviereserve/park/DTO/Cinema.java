package com.moviereserve.park.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Cinema {
	private Long cinemaId;
	private String cinemaName;
	private String cinemaAddress;
}
