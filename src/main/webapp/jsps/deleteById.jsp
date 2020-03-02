<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>ENTER ID FOR DELETE EMPLOYEE RECORD</h1>
	<form:form action="/deleteDataById" method="GET">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="number" name="id"></td>
			</tr>
		</table>
		<input type="submit" value="Delete Record">
	</form:form><br><br>
	<a href="/welcome">go to welcome page</a>
	
</body>
</html>