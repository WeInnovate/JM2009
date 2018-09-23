package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2009_JDBC_USER WHERE ID = 101");
			rs.next();
			String name = rs.getString(2);
			System.out.println("Name is: " + name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
