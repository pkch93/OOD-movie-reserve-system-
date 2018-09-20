package com.moviereserve.park.DTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Point extends Discount{
	private Long accountId;
	private Integer vaildPoint;
}
