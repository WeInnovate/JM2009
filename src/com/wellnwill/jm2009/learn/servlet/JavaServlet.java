package com.wellnwill.jm2009.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/java" }, initParams = { @WebInitParam(name = "trainerName", value = "Atul"),
		@WebInitParam(name = "trainerMobile", value = "9876543210") })
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JavaServlet() {
	}

	private void sum() {
		System.out.println("This is sum method");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i = 10 + 20;
		sum();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String studentName = request.getParameter("studentName");

		ServletConfig cfg = getServletConfig();
		String trnName = cfg.getInitParameter("trainerName");
		String trnMobile = cfg.getInitParameter("trainerMobile");

		ServletContext ctx = cfg.getServletContext();
		ctx.setAttribute("fullInstituteName", "InfoCampus Logics Pvt. Ltd.");
		String instituteName = ctx.getInitParameter("institute");

		response.setContentType("text/HTML");
		out.println("Hello, " + studentName);
		out.print("<br />");
		out.println("Your tainer is " + trnName + " and his mobile number is " + trnMobile + " in " + instituteName);
	}

}
