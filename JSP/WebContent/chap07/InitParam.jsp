<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>어플리케이션초기화 파라미터 ㅇㅖ제</title>
</head>
<body>
<h2>DB_NAME 초기화 파라미터의 값은? ${initParm[DB_NAME]}</h2>
<h2>DB_NAME 초기화 파라미터의 값은? ${initParm[TOOL_NAME]}</h2>
<h2>요청URI: ${pageContext.request.requestURI } </h2>

<%
request.getRequestURI();
%>

</body>
</html>