<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");

	if (userName.equalsIgnoreCase(password)) {
		request.setAttribute("msg", "Login Successful from JSP !!!");
		RequestDispatcher rd = request.getRequestDispatcher("profile");
		rd.forward(request, response);
		
	} else {
		response.sendRedirect("login.jsp?msg=Login+Failed");
	}
%>