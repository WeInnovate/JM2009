package com.wellnwill.jm2009.learn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

	public MyServletContextListener() {
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println(this.getClass().getSimpleName() + " Application is Down");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(this.getClass().getSimpleName() + " Application is Up");
//		System.out.println(sce.getServletContext().getInitParameter("institute"));
		String createTable = sce.getServletContext().getInitParameter("createTable");
		if(createTable != null && createTable.equalsIgnoreCase("Yes")) {
			System.out.println("Creating tables...");
		}
		else {
			System.out.println("Table creation is not required.");
		}
	}

}
