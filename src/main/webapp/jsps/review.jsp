<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${reviewData}</h1>
	<table border="2" cellpadding="0.5">
		<tr>
			<td>Id</td>
			<td>${empReview.id}
			<td>
		</tr>

		<tr>
			<td>Name</td>
			<td>${empReview.name}
			<td>
		</tr>

		<tr>
			<td>City</td>
			<td>${empReview.city}
			<td>
		</tr>

		<tr>
			<td>College</td>
			<td>${empReview.clg}
			<td>
		</tr>

		<tr>
			<td>Phone</td>
			<td>${empReview.phone}
			<td>
		</tr>

	</table>
</body>
</html>