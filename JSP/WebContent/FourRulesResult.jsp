<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head><title>사칙연산</title>
<body>
덧셈의 결과는? <%= request.getAttribute("SUM") %> <br>
뺄셈의 결과는? <%= request.getAttribute("DIFFERENCE") %><br>
곱셈의 결과는? <%= request.getAttribute("PRODUCT") %><br>
나눗셈의 결과는? <%= request.getAttribute("QUOTIENT") %><br>
</body>
</html>