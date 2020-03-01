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
	<h1>${welMsg}</h1>

	<form:form modelAttribute="emp" method="POST" action="/review">
		<table>
			<tr>
				<td>Id
				<td><form:input type="number" path="id" />
			</tr>

			<tr>
				<td>Name
				<td><form:input type="text" path="name" />
			</tr>

			<tr>
				<td>City
				<td><form:input type="text" path="city" />
			</tr>

			<tr>
				<td>College
				<td><form:input type="text" path="clg" />
			</tr>

			<tr>
				<td>Phone
				<td><form:input type="number" path="phone" />
			</tr>

		</table>
		<input type="submit" value="Submit Form"/>
	</form:form>
	
</body>
</html>