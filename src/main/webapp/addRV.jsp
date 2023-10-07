<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add an RV</title>
</head>
<body>
<h1> Add an RV below:</h1>
<form action="addRV" method="post">
		<p>Type: <input
			type="text" name="type" size="25"/> </p>
		
		<p>Average Cost: <input
			type="text" name="avgCost" size="25"/> </p>
		
		<p>Average Size: <input
			type="text" name="avgSize" size="25"> </p>
			
		<p><input type="submit" value="Submit" /></p>
	</form>
</body>
</html>