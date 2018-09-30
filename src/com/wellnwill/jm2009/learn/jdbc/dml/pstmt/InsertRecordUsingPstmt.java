package com.wellnwill.jm2009.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class InsertRecordUsingPstmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2009_USER VALUES(?, ?)");
			pstmt.setInt(1, 201);
			pstmt.setString(2, "PSTMT");
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Record has been inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
