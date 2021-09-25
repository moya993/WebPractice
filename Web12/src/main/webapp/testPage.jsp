<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="Pack.Person" %>	 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 객체를 생성해보자 -->
	<!-- 객체를 생성할 때 객체이름을 recv로 쓰겠다는 말 -->
	<!-- class를 가져올 떄는 (패키지이름.클래스이름) 으로 가져와야함 -->
	<jsp:useBean id="recv" class="Pack.Person" scope="page" />
	<jsp:setProperty name="recv" property="*" />
	
	<jsp:getProperty name="recv" property="id" />
	<jsp:getProperty name="recv" property="pass" />

 	<%= recv.getId() %>
	<%= recv.getPass() %>

</body>
</html>