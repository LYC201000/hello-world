<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>점점 크게 인사하기</title>
</head>
<body>
<%
for(int i=1;i<=6;i++)
out.print("<font size="+i+">안녕하세요. 여러분~"+"</font><br>");
%>
</body>
</html>