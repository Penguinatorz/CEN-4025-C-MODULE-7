<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>To do List</title>
</head>
<body>
	<h1>To do List</h1>
	<form name="toDoList" action="event" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>Event:</td>
				<td><input type="text" name="list" size="50" required /></td>
			</tr>

		</table>
		<input type="Submit" value="Submit to Mysql" name="Event" /> <input
			type="reset" value="Clear" name="Clear" /><input type="button"
			value="Add to List" name="Pass" />
	</form>
	<form name="toDoList" action="Add.jsp" method="post">
		<input type="Submit" value="Add a List" name="Event" />
	</form>
		<form name="toDoList" action="Delete.jsp" method="post">
		<input type="Submit" value="Delete a List" name="Event" />
	</form>
		<form name="toDoList" action="list.jsp" method="post">
		<input type="Submit" value="View List" name="Event" />
	</form>
</body>
</html>