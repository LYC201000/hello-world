<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>개인정보 출력 화면</title>
</head>
<body>

<h3>개인 정보 출력</h3>

이름 <%= request.getParameter("NAME")%><br>
전화번호  <%= request.getParameter("NUM")%>






</body>
</html>