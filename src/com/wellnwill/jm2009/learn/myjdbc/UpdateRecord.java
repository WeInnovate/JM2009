package com.wellnwill.jm2009.learn.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("UPDATE MYJDBC_USER SET NAME = 'Matin' WHERE ID = 101");
			if (i > 0) {
				System.out.println("Recors has been updated successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
