package com.moviereserve.park.DAO;

import org.springframework.stereotype.Repository;

@Repository
public interface SeatDAO {
	// 좌석 등록 기능
	public void reserve();	
}
