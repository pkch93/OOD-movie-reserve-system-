package com.moviereserve.park.DTO;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Movie {
	private Long movieId;
	private String title;
	private Integer viewingGrade;
	private Timestamp registerDate;
	private String story;
	private String posterUrl;
}
