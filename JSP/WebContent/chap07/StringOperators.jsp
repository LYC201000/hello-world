<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>문자열 비교</title>
</head>
<body>
입력문자열 : ${param.STR1 }, ${param.STR2 }<br><br>
두 문자열이 같습니까? ${param.STR1 == param.STR2}<br>
어는 문자열이 먼저입니까? ${param.STR1 < param.STR2 ? param.STR1 : param.STR2}

</body>
</html>