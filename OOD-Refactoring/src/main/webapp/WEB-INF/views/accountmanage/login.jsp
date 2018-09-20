<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="/resources/templates/head.jsp" %>
</head>
<body>
	<div class="login">
		<img class="mainlogo logo" src="#" alt="logo"/>
		<section class="login__box">
			<form action="#" method="post">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
				<div class="field field__login">
					<label for="accountId">
						<span class="field__login--id">아이디</span>
						<input type="text" id="accountId" class="login--input" name="username" />
					</label>
				</div>
				<div class="field field__login">
					<label for="accountId">
						<span class="field__login--pw">비밀번호</span>
						<input type="password" id="accountPw" class="login--input" name="password" />
					</label>
				</div>
				<input type="submit" class="input--submit login--submit" value="로그인" />
			</form>
		</section>
	</div>
</body>
</html>