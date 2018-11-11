package com.wellnwill.jm2009.learn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Filter1 implements Filter {

	public Filter1() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">> Preprocessing " + this.getClass().getSimpleName());
		chain.doFilter(request, response);
		System.out.println("<< Postprocessing " + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
