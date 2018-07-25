<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
    String name = (request.getParameter("NAME") == null)?"": request.getParameter("NAME");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>인사하기</title>
</head>
<body>
안녕하세요. <%= name %>님
		  <% application.log(name + "[인사하기]JSP 페이지가 호출 되었습니다."); %>
</body>
</html>