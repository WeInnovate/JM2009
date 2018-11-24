<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Footer</title>
</head>
<body>
<hr>
<%= config.getInitParameter("any-data") %>
&nbsp;
&copy; 2018, <%= application.getInitParameter("institute") %>
</body>
</html>