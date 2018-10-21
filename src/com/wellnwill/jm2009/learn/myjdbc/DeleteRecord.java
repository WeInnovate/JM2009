package com.wellnwill.jm2009.learn.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("DELETE FROM MYJDBC_USER WHERE ID = 101");
			if (i > 0) {
				System.out.println("Record has been deleted.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
