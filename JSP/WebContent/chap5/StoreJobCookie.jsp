<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
       
    <% Cookie cookie = new Cookie("JOB","programmer");
    	cookie.setPath("/JSP/char4/");
    	response.addCookie(cookie);
    	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>쿠키 데이터 저장하기</title>
</head>
<body>
 JOB 쿠키가 저장되었습니다.
</body>
</html>