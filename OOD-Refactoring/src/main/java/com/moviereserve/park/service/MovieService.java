package com.moviereserve.park.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereserve.park.DAO.MovieDAO;
import com.moviereserve.park.DTO.Movie;

@Service
public class MovieService {
	
	MovieDAO movieDAO;
	
	@Autowired
	public MovieService(SqlSession sqlSession) {
		// TODO Auto-generated constructor stub
		this.movieDAO = sqlSession.getMapper(MovieDAO.class);
	}
	
	public List<Movie> getMovieList(){
		
		return movieDAO.movieList();
	}
	// 모든 영화 목록 가져오기
	
	public List<Movie> getPopularMovies(){
		return movieDAO.popularMovies();
	}
	// 인기 있는 영화 목록 가져오기 (리뷰의 평점 순으로)
	
	public List<Movie> getRecentMovies(){
		return movieDAO.recentMovies();
	}
	// 최신 영화 목록 가져오기 (개봉 날짜 순)
	
	public List<Movie> movieSearch(String queryString){
		return movieDAO.search(queryString);
	}
	// 영화 검색 기능
	
	public Movie getMovie(Integer movieId) {
		return movieDAO.movieDetail(movieId);
	}
}
