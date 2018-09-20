<%@ page pageEncoding="UTF-8" %>
<nav class="navbar">
	<a href="/park/"><img class="navbar--logo" src="#" alt="logo" /></a>
	<form class="navbar__searchbox navbox" action="/park/searchResult" method="POST">
		<input type="text" name="queryString" placeholder="검색할 영화를 입력해주세요!" />
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input type="submit" value="검색" />
	</form>
	<ul class="navbar__eltbox navbox right">
		<li class="navbar--elt"><a href="/park/login">로그인</a></li>
		<li class="navbar--elt"><a href="/park/join">회원가입</a></li>
	</ul>
</nav>