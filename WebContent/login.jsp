<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body>
<div class="container">
<%@ include file="header.jsp" %>
<form action="process-login.jsp" method="post">
  <div class="form-group">
  <span class="error"><%-- <%= request.getParameter("msg") == null ? "" : request.getParameter("msg")  %> --%>${param.msg}</span><br />
    <label for="exampleInputEmail1">Email address</label>
    <input type="text" name="userName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <input type="submit" class="btn btn-primary" value="Login" />
</form>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>