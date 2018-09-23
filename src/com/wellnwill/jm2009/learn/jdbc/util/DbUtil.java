package com.wellnwill.jm2009.learn.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection con;

	public static Connection getDatabaseConnection() throws SQLException {
		if (con == null) {
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return con;
	}
}
