package com.wellnwill.jm2009.learn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(">> GET " + this.getClass().getName());
		response.sendRedirect("user-login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(">> POST " + this.getClass().getName());
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(userName.equalsIgnoreCase(password)) {
			System.out.println("You are a valid user");
			request.setAttribute("msg", "Login Successful!!!");
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		}
		else {
			System.out.println("You are not a valid user.");
			response.sendRedirect("user-login.html");
		}
	}

}
