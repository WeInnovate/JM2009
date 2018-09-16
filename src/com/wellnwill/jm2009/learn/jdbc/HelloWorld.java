package com.wellnwill.jm2009.learn.jdbc;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		List<String> list = getFruits();
		System.out.println(list);
	}
	
	public static List<String> getFruits(){
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Guava");
		return list;
	}

}
