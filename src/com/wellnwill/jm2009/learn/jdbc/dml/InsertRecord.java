package com.wellnwill.jm2009.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		/**
		 * 0. Load the driver class - Optional not required in latest JDBC 
		 * 1. Establish the connection with the database 
		 * 2. Create statement/command 
		 * 3. Execute the statement 
		 * 4. Process the result
		 */

		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO JM2009_USER VALUES(103, 'Atul')");
			if(i > 0) {
				System.out.println("Record inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
