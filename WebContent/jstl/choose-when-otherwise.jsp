<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="age" scope="session" value="50" />
	<c:out value="Age is: ${age}" />
	<br>

	<c:choose>
		<c:when test="${age <= 6 }">
You are baby.
</c:when>

		<c:when test="${age > 6 and age < 18 }">
You are teen.
</c:when>

		<c:when test="${age >= 18 and age < 60 }">
You are adult.
</c:when>

		<c:otherwise>
You must be senior citizen.
</c:otherwise>
	</c:choose>

</body>
</html>
</body>
</html>
