<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
    <%
    int sum = 0;
    for( int cnt = 1; cnt <= 100; cnt++)
    	sum+=cnt;
    request.setAttribute("RESULT", new Integer(sum));
    RequestDispatcher dispatcher = request.getRequestDispatcher("HundredResult.jsp");
    dispatcher.forward(request, response);
    %>

</body>
</html>