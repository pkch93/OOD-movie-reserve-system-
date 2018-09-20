package com.moviereserve.park.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moviereserve.park.DTO.Reserve;

@Repository
public interface ReserveDAO {
	// 예매  - 영화 선택, 극장 선택, 좌석선택
	public void reserve();
	// 예매 조회 기능 - parameter로 기간을 가져온다 (timestamp 조절하는 방법)
	public List<Reserve> reserveList();
}