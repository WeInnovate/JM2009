package com.wellnwill.jm2009.learn.myjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class SelectRecord {
	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM MYJDBC_USER");
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
