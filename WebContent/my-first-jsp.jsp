<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="my-common-error-page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<%@ page import="java.util.*,java.io.*"%>
<meta charset="ISO-8859-1">
<title>My first JSP</title>
</head>
<body>
	<h1>Welcome to JSP</h1>
	<%
		int i = 10 + 20 + sum(1, 2) + global;
		displayMsg("Hello there!");
		
		/* int j = 10/0; */
	%>

	<%
		out.print("I'm out");
	%>

	<%=i%>

	<%!int global = 100;

	public int sum(int a, int b) {
		return a + b;
	}%>

	<%!public void displayMsg(String msg) {
		System.out.println(msg);
	}%>
</body>
</html>

<%
	List<String> fruits = new ArrayList<>();
	fruits.add("Apple");
	fruits.add("PineApple");
	fruits.add("Guava");
%>

<%= fruits %>