<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기 - 입력화면</title>
</head>
<body>
	<h2>글쓰기</h2>
	<form action=BBSpost.jsp method="POST">
		이름:<input type=text name=NAME><br> 제목:<input type=text
			name=TITLE><br>
		<textarea cols=50 rows=5 name=CONTENT></textarea>
		<br> <input type=submit value='저장'> <input type=reset
			value='cnlth'>
			</form>
</body>
</html>	