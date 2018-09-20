<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/resources/templates/head.jsp" %>
</head>
<body>
<%@ include file="/resources/templates/navbar.jsp" %>
<div class="container">
	<section class="main">
	<c:if test="${searchResult == null}">
		<h1 class="main--result-title main__element">검색 결과가 없습니다</h1>
	</c:if>
	</section>
</div>
</body>
</html>