package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("INSERT INTO JM2009_JDBC_USER VALUES(103, 'John')");
			if (i > 0) {
				System.out.println("Record has been inserted.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
