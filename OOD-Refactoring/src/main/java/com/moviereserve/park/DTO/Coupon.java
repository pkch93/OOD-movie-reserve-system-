package com.moviereserve.park.DTO;

import java.sql.Timestamp;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Coupon extends Discount{
	private String serialNumber;
	private Timestamp vaildDate;
}
