<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>개인 정보 입력 화면</title>

</head>
<body>
	<h2>개인 정보 입력</h2>
	<form action=/JSP/pinfo-result method=GET>
		이름: <input type=text name=NAME><br> 
		아이디: <input type=text name=ID><br> 
			패스워드: <input type=text name=PASSWORD><br><br> 
		 
			성별:남<input type=radio name=GENDER value=MALE><br>
				여<input type=radio name=GENDER value=FEMAIL><br> 
		메일 수신여부:
		 	공지메일<input type=checkbox name=INOTICE><br>
		 	광고 메일<input type=checkbox name=CNOTICE><br> 
		 	배송 확인 메일<input type=checkbox name=DNOTICE><br><br>
	 	직업:
			<select name=JOB>
			<option>회사원</option>
			<option>학생</option>
			<option>기타</option>
		</select><br><br> 
		<input type=reset name="취소"><br> 
		<input type=submit name="학인"><br>
	</form>
</body>
</html>