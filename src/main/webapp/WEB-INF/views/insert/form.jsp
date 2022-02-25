<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/mybatis/rst">
		<table border="1">
			<tr>
				<th>발신자</th>
				<td><input type="text" name="sender"></td>
				<th>수신자</th>
				<td><input type="text" name="receiver"></td>
			</tr>
			<tr>
				<td colspan="4">내용 <textarea rows="10" cols="5" name="content"></textarea></td>
			</tr>
			<tr>
				<th colspan="4"><input type="submit" value="발송"></th>
			</tr>
		</table>
	</form>
	

	
</body>
</html>