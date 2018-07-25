<%@ page language="java" import="java.io.*,java.util.*" 
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%!
    private PrintWriter logFile;
    
    public void jspInit() {
    	String filename="c:\\data\\datelog.txt";
    	
    	try{
    		logFile = new PrintWriter(new FileWriter(filename,true));
    	}
    	catch (IOException e){
    		System.out.printf("%TT - %s 파일을 열수 없습니다. %n", new GregorianCalendar(), filename);
    	
    	}
    }
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>현재의 날짜와 시각</title>
</head>
<body>
	<%
GregorianCalendar now = new GregorianCalendar();
String date = String.format("현재 날짜: %TY년 %Tm월 %Te일",now,now,now);
String time = String.format("현재 tlrkr: %TI시 %TM분 %TS초",now,now,now);

out.println(date + "<br>");
out.println(time + "<br>");
if(logFile !=null)
	logFile.printf("%TF %TT에호출되었습니다.%n", now, now);
%>

</body>
</html>
<%! public void jspDestroy() {
		if (logFile != null)
			logFile.close();
	}%>