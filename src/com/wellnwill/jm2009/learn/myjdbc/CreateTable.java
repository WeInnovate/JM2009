package com.wellnwill.jm2009.learn.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		/*
		 * 1. Establish the database connection
		 * 2. Create statement / command
		 * 3. Execute the command
		 * 4. Process the result
		 */
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			boolean bool = stmt.execute("CREATE TABLE MYJDBC_USER(ID NUMBER, NAME VARCHAR)");
			if(!bool) {
				System.out.println("Table created successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
