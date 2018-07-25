<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>성격테스트</title>
</head>
<body>
<H2>성격테스트</H2>

당신의 성격을 테스트합니다. 데이터를 입력한 후 확인 버튼을 눌러주세요.<br> 
<form action=ptest>


이름: <input type=text name=NAME><br> 

좋아하는 색은?<br>
		 	노랑<input type=checkbox name=nNOTICE><br>
		 	빨강<input type=checkbox name=bbNOTICE><br> 
		 	파랑<input type=checkbox name=bNOTICE><br><br>

좋아하는 동물은?
			<select name=JOB>
			<option>타조</option>
			<option>호랑이</option>
			<option>치타</option>
			</select><br><br>

좋아하는 음식은?(모두고르세요):<br>
		 	짜장<input type=checkbox name=jjNOTICE><br>
		 	짬뽕<input type=checkbox name=jbNOTICE><br> 
		 	탕수육<input type=checkbox name=tsuDNOTICE><br><br>

<input type=submit name="확인"><br>

</body>
</html>