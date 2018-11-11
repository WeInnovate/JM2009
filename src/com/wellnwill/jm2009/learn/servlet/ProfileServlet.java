package com.wellnwill.jm2009.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");

		PrintWriter out = response.getWriter();
		request.setAttribute("msg", "Login Successful!!!!");
		request.setAttribute("temp", "Temp message");
		request.removeAttribute("temp");
		out.println(request.getAttribute("msg"));
		out.println("Hello, " + userName);
	}

}
