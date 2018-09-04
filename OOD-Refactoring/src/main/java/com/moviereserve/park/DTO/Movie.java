package com.moviereserve.park.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Movie {
	private Long movieId;
	private String title;
	private Integer viewingGrade;
	private String genre;
	private String story;
	private List<String> actors;
	private String posterUrl;
}
