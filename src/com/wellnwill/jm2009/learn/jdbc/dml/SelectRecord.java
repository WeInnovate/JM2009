package com.wellnwill.jm2009.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class SelectRecord {

	public static void main(String[] args) {
		/**
		 * 0. Load the driver class - Optional not required in latest JDBC 
		 * 1. Establish the connection with the database 
		 * 2. Create statement/command 
		 * 3. Execute the statement 
		 * 4. Process the result
		 */
		try {
			Connection con = DbUtil.getDatabaseConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2009_USER WHERE ID = 101");
			
			rs.next();
			
			System.out.print("Record is present: ");
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println(id +" "+ name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
