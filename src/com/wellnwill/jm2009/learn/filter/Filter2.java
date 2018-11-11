package com.wellnwill.jm2009.learn.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class Filter2 implements javax.servlet.Filter {

	List<String> blockedUser = new ArrayList<>();
    public Filter2() {
    	blockedUser.add("atul");
    	blockedUser.add("ram");
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println(">> Preprocessing " + this.getClass().getSimpleName());
		String un = request.getParameter("userName");
		System.out.println(un);
		if(un != null && blockedUser.contains(un)) {
			System.out.println("Bloacked user");
		}
		else {
			chain.doFilter(request, response);
		}
		System.out.println("<< Postprocessing " + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
