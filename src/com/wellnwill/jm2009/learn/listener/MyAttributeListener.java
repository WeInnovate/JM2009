package com.wellnwill.jm2009.learn.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyAttributeListener implements ServletRequestAttributeListener {

	public MyAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute removed: " + srae.getValue());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute added: " + srae.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute replaced: " + srae.getValue());
	}

}
