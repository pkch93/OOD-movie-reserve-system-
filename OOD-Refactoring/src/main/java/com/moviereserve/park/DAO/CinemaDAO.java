package com.moviereserve.park.DAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.moviereserve.park.DTO.Cinema;

@Repository
public interface CinemaDAO {
	// 필요한 기능들 (극장 목록 보여주기, 극장 등록)
	public ArrayList<Cinema> cinemaList();
	public void register(String name, String address);
}
