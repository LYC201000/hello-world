<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기</title>
</head>
<body>
	<%
		String str = request.getParameter("RESULT");
	
		if (str.equals("SUCCESS"))
			 out.println("저장되었습니다");
		else
			 out.println("파일에 데이터를 쓸 수 없습니다");
	%>
</body>
</html>