package com.moviereserve.park.DAO;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.moviereserve.park.DTO.Movie;

@Repository
public interface MovieDAO {
	public ArrayList<Movie> movieList();
	public ArrayList<Movie> popularMovies();
	public ArrayList<Movie> recentMovies();
	public ArrayList<Movie> search(String queryString);
	public void create();
	public void delete(Integer movieId);
	public Movie movieDetail(Integer movieId);
}