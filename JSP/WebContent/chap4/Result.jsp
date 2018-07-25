<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%String result = request.getParameter("RESULT"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<h3>회원가입결과</h3>
<%
if(result.equals("SUCCESS"))
	out.println("가입되었습니다");
else
	out.println("가입되지 않았습니다");
%>

</body>
</html>