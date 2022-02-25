<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>총 ${result } 건이 생성 되었습니다</p>
  <%-- 	<a href="/exam/insertAc"> 추가 </a> 
	<p>---------------------------------------------</p>
	<c:forEach var="vo" items="${list }">
	<p>아이디 : ${vo.id }</p>
	<p>비밀번호 : ${vo.pass }</p>
	<p>이름 : ${vo.name }</p>
	<p>---------------------------------------------</p>
	</c:forEach>	 --%>
</body>
</html>