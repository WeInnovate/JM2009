package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("UPDATE JM2009_JDBC_USER SET NAME = 'Anupam Bajpai' WHERE ID = 102");
			if(i > 0) {
				System.out.println("Record has been updated.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
