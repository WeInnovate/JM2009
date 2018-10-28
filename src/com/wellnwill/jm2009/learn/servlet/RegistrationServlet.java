package com.wellnwill.jm2009.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet is ruuning....");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost is ruuning....");

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String street1 = request.getParameter("street1");
		String street2 = request.getParameter("street2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String[] courses = request.getParameterValues("courses");
		String gender = request.getParameter("gender");

		if (email == null || email.equals("")) {
			response.sendRedirect("user-registration.html");
		}

		PrintWriter out = response.getWriter();
		out.println("<h1>Hello, " + email + "</h1>");
		out.print("<br />");
		out.println(street1 + ", " + street2 + ", " + city + ", " + state + " - " + zip);
		out.print("<br />");
		out.print(gender);
		out.print("<br />");

		if (courses != null) {
			String append = ", ";
			for (int i = 0; i < courses.length; i++) {
				if (i == courses.length - 1) {
					append = "";
				}
				out.print(courses[i] + append);
			}
		}
	}
}
