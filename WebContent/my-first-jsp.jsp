<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My first JSP</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<%
		int i = 10 + 20 + sum(1, 2) + global;
		displayMsg("Hello there!");
	%>
	<%=i%>
	<%!int global = 100;

	public int sum(int a, int b) {
		return a + b;
	}

	public void displayMsg(String msg) {
		System.out.println(msg);
	}%>
</body>
</html>