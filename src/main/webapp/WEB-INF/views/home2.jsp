<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Spring JDBC</h1>
	<hr/>
	<p>총 : ${cnt } 건 검색</p>
	<c:forEach var="vo" items="${list }">
	<div style="margin-top: 30px; background-color: #cfcf2f; padding: 3px;">
		<p>
		<b>${vo.sender } → ${vo.receiver } | (${vo.senddate })</b>
		</p>	
		<p>
		${vo.content }
		</p>
	</div>
	</c:forEach>
	<P>The time on the server is ${serverTime}.</P>
</body>
</html>
