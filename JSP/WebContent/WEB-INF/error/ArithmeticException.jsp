<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    
    <%
    response.setStatus(200);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>산술 연산에러</title>
</head>
<body>

산술 연산 도중 에러가 발생함<br><br>
상세 에러 메시지 : <%= exception.getMessage() %>

</body>
</html>