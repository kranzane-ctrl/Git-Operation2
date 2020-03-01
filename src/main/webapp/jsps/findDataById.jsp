<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FIND DATA BY ID</h1>
<form:form action="/findDataById"  method="GET">
<table>
<tr>
<td>ID</td>
<td><input type="number" name="id"></td>
</tr>
</table>
<%-- <form:input path="/findDataById"/> --%>
<input type="submit" value="Submit Id">
</form:form>
</body>
</html>