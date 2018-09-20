package com.moviereserve.park.DTO;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Reserve {
	private Long reserveId;
	private Timestamp reserveDate;
	private Integer reserveCost;
	private String reserveMovie;
	private String reserveCinema;
	private String reserveTheater;
	private String reserveSeat;
}
