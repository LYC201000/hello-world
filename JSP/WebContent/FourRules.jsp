<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String str1 = request.getParameter("NUM1");
String str2 = request.getParameter("NUM2");
int num1 = Integer.parseInt(str1);
int num2 = Integer.parseInt(str2);

request.setAttribute("SUM", new Integer(num1 + num2));
request.setAttribute("DIFFERENCE", new Integer(num1 - num2));
request.setAttribute("PRODUCT", new Integer(num1 * num2));
request.setAttribute("QUOTIENT", new Integer(num1 / num2));
RequestDispatcher dispatchar = request.getRequestDispatcher("FourRulesResult.jsp");
dispatchar.forward(request, response);

%>

</body>
</html>