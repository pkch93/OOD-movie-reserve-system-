package com.moviereserve.park.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Review {
	private Long reviewId;
	private String reviewTitle;
	private String content;
	private Integer hit;
	private Integer recommend;
	private Long accountId;
	private Long movieId;
}
