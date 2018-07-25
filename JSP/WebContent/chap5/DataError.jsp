<%@ page language="java" isErrorPage="true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%
      response.setStatus(200);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>덧셈 프로그램 - 에러화면</title>
</head>
<body>
<h1>잘못된 데이터가 입력 되었습니다</h1>
		상세 에러메시지 :<%= exception.getMessage() %>
</body>
</html>