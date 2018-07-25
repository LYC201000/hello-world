<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>인기상품품목</title>
</head>
<body>

<h3>이달에 가장 많이 팔린 과일</h3>



<c:forEach items="${FRUITS}" var="fruits" varStatus="status"> 

${fruits }<br/>
</c:forEach>
<%-- 1위. ${FRUITS[0] } <br>
2위. ${FRUITS[1] } <br>
3위. ${FRUITS[2] } <br>
 --%>
</body>
</html>