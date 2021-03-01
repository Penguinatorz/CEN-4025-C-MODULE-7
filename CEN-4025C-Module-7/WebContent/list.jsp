<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listed Events</title>
</head>
<%
String events = request.getParameter("list");
%>
<body>
	<h1>Listed Events</h1>
	
	<table border="1">
		<tbody>
			<tr>
				<td>Events:</td>
				<td><%=events%></td>
		</tbody>
	</table>
	<a href="index.jsp">Back</a>
</body>
</html>