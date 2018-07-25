<%@page import="java.util.Locale"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="sun.text.normalizer.CharTrie.FriendAgent"%>
<%@page import="com.sun.openpisces.Dasher"%>
<%@page import="java.io.*, java.util.Date"%>

<%@page import="java.io.*,java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기 게시판 - 결과 화면</title>
</head>
<body>
	<H2>글쓰기</H2>
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("NAME");
		String title = request.getParameter("TITLE");
		String content = request.getParameter("CONTENT");
		String result;
		
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy.mm.dd hhss", Locale.KOREA);
		
		
		
		Date currenrTime = new Date();
		String strTime = simpleDateFormat.format( currenrTime );
		String fileName = strTime + ".txt"; 
		
		
		PrintWriter writer = null;
		try {
			String filePath = application.getRealPath("/WEB-INF/bbs/" + fileName);

			writer = new PrintWriter(filePath);
			writer.printf("제목: %s %n", title);
			writer.printf("글쓴이: %s %n", name);
			writer.println(content);
			result = "SUCCESS";

		} catch (IOException ioe) {
			result = "FAIL";
			
		} finally {

			try {
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		response.sendRedirect("BBSpostResult.jsp?RESULT=" + result);
	%>
</body>
</html>