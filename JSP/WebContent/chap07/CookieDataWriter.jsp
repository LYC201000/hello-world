<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    Cookie cookie = new Cookie("NAME","John");
    response.addCookie(cookie);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키데이터 저장프로그램</title>
</head>
<body>
쿠키값이 설정되었습니다

<a href = "CookieDaraReader.jsp" >확인하기</a> 

</body>
</html>