<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   

<!-- 내가 사용할 클래스를 (패키지명.클래스명)으로 import 시켜야함, scope는 속성을 정의 -->    
<%@ page import="Pack.Person" %>	   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<h1>로그인</h1>
	<form method="post" action="testPage.jsp">
		ID<input type="text" name="id" value="tiger"><p>
		<input type="text" value="pass" value=""><p> 
		<input type="submit" value="전송"><p>
	</form>
</body>
</html>