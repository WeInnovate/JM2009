package com.wellnwill.jm2009.learn.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsterIntoTable {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO MYJDBC_USER VALUES(101, 'John')");
			if (i > 0) {
				System.out.println("Record has been inserted.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
