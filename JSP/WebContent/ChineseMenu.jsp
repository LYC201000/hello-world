<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오늘의 매뉴</title>
</head>
<body>
<h3>오늘의 매뉴</h3>
- 짜장면<br>
- 볶음밥 <br>
- 짬뽐 <br>
<%
out.flush();
RequestDispatcher dispatcher = request.getRequestDispatcher("Now.jsp");
dispatcher.forward(request, response);

%>

</body>
</html>