<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="/resources/templates/head.jsp" %>
</head>
<body>
<%@ include file="/resources/templates/navbar.jsp" %>
<div class="container">	
	<section class="main">
		<div class="main__banner">
			<h3 class="subtitle">인기 영화</h3>
			<article class="popular main__element">
				<c:forEach items="${popularMovies}" var="movie">
					<div class="movie-info">
						${movie.title}
					</div>
				</c:forEach>
			</article>
		</div>
		<div class="main__banner">
			<h3 class="subtitle">최신 영화</h3>
			<article class="recently main__element">
				<c:forEach items="${recentMovies}" var="movie">
					<div class="movie-info">
						${movie.title}
					</div>
				</c:forEach>
			</article>
		</div>
		<section class="main__info main--flex">
			<article class="notice main__element">
				
			</article>
			<article class="event main__element">
				
			</article>
		</section>
	</section>
	<footer class="contact">
		
	</footer>
</div>
</body>
</html>