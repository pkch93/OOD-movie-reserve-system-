package com.moviereserve.park.DAO;

import org.springframework.stereotype.Repository;

@Repository
public interface ScreenDAO {
	public void registerMovie(Integer movieId, Integer cinemaId, Integer theaterId);
}
