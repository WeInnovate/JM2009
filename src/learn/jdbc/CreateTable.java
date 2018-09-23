package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		/**
		 * 1. Establish the connection with database
		 * 2. Create Statement/command
		 * 3. Execute the statement
		 * 4. Process the result
		 */
		
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			boolean b = stmt.execute("CREATE TABLE JM2009_JDBC_USER(ID NUMBER, NAME VARCHAR)");
			if(!b) {
				System.out.println("Table created successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
