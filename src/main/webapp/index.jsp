<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fifth Wheel Fanatics</title>
</head>
<body>
<h1>Fifth Wheel Fanatics Home Page</h1>
<p>Welcome to the Fifth Wheel Fanatics web page, where you can learn anything you need to know about fifth wheel brands!
	<form action="showFifthWheel" method="get">
		<input type="submit" value="Show Fifth Wheels" />
	</form>
	<p> <a href="updateFifthWheel.jsp"> <button>Update Fifth Wheels</button></a></p>
	<p><a href="deleteFifthWheel.jsp"><button>Delete Fifth Wheels</button></a></p>
	<p><a href="addFifthWheel.jsp"><button>Add Fifth Wheels</button></a></p>
	
	<form action="showRV" method="get">
		<input type="submit" value="Show RV's" />
	</form>
	<p> <a href="updateRV.jsp"> <button>Update RV's</button></a></p>
	<p><a href="deleteRV.jsp"><button>Delete RV's</button></a></p>
	<p><a href="addRV.jsp"><button>Add RV's</button></a></p>
	
</body>
</html>