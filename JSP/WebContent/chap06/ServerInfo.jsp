<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>엡서버의 정보</title>

</head>
<body>
웹서버의 종류 <%= application.getServerInfo() %><br>
지원하는 서블릿 버전<%= application.getMajorVersion() %>.<%=application.getMinorVersion() %> <br>
</body>
</html>