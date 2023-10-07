<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show RV's & Fifth Wheels</title>
</head>
<body>
	<h1><u>List of all Fifth Wheel's and RV's: </u></h1>
	<table>
		<c:forEach items="${requestScope.allRVs}" var="currentrv">
			<tr>
				<td>${currentrv.type}|</td>
				<td>${currentrv.avgCost}</td>
				<td>${currentrv.avgSize}</td>
			</tr>
			<c:forEach items="${currentrv.fifthwheel}" var="currentfifthwheel">
					<tr>
						<td>${currentfifthwheel.manufacturer}|</td>
						<td>${currentfifthwheel.brand}|</td>
						<td>${currentfifthwheel.model}</td>
						<td>${currentfifthwheel.rating}|</td>
					</tr>
				</c:forEach>
		</c:forEach>
		
	</table>
	
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>