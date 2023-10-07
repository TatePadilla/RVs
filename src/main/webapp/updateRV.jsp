<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update RV's</title>
</head>
<body>
<h1>Update the available RV's below:</h1>

	<form action="updateRV" method="post">
		<p>Type of RV to Update: <input type="text" name="oldType" size="25"> </p>
		<p>___________________________________________</p>
		<p>New Type: <input type="text" name="type" size="25" /></p>
		<p>New Average Cost: <input type="text" name="avgCost" size="25" /> </p>
		<p>New Average Size: <input type="text" name="avgSize" size="25" /></p>
			<p><input type="submit" value="Update" /></p>
	</form>
</body>
</html>