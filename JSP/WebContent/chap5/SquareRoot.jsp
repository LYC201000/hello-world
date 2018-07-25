<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="InputDataError.jsp"%>
    <%
String str = request.getParameter("NUM");
if(str == null)
	 throw new Exception("데이터가 입력되지 않았습니다");

double num = Double.parseDouble(str);
if(num < 0)
	throw new Exception("데이터가 입력되었습니다");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>제곱근프로그램 </title>
</head>
<body>

<%=num  %>의 제콥근은?<%=Math.sqrt(num) %>

</body>
</html>