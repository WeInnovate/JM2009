package com.wellnwill.jm2009.learn.myjdbc.metadata;

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
			ResultSet rs = stmt.executeQuery("SELECT * FROM MYJDBC_USER");
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1) + " " + rsmd.getColumnTypeName(1));
			System.out.println(rsmd.getColumnName(2) + " " + rsmd.getColumnTypeName(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
