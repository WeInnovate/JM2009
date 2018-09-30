package com.wellnwill.jm2009.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class MyResultSetMetaData {

	public static void main(String[] args) {

		try {
			Connection con = DbUtil.getDatabaseConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2009_USER");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Total Columns: " + rsmd.getColumnCount());
			System.out.println("Column 1: " + rsmd.getColumnName(1));
			System.out.println("Column 2: " + rsmd.getColumnName(2));
			System.out.println("Column 1 Type: " + rsmd.getColumnTypeName(1));
			System.out.println("Column 2 Type: " + rsmd.getColumnTypeName(2));
			System.out.println("" + rsmd.getPrecision(1));
			System.out.println("" + rsmd.getPrecision(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
