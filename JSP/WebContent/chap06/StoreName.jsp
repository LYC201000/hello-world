<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String name = (request.getParameter("NAME") == null)?"": request.getParameter("NAME");
    application.setAttribute("NAME", name);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>웹 애플리케이션 테이터 저장하기</title>
</head>
<body>
NAME 데이터가 저장되었습니다.

</body>
</html>