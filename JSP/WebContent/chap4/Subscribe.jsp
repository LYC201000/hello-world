<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>

<%
String agree = request.getParameter("AGREE");
String result = null;

if (agree.equals("YES")) {
	String id = (String) session.getAttribute("ID");
	String password = (String) session.getAttribute("PASSWORD");
	String name = (String) session.getAttribute("NAME");
PrintWriter writer =null;
	try {
		String filePath = application.getRealPath("/WEB-INF/" + id + ".txt");
		writer = new PrintWriter(filePath);
		writer.println("아이디:" + id);
		writer.println("패스워드" + password);
		writer.println("이름" + name);
		result = "SUCCESS";
	} catch (IOException ioe) {
		result = "FAIL";
	} finally {
		try {
			writer.close();
		} catch (Exception e) {

		}
	}
} else {
	result = "FAIL";
}
session.invalidate();
response.sendRedirect("Result.jsp?RESULT=" + result);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>