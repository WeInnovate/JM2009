package com.wellnwill.jm2009.learn.myjdbc.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO MYJDBC_USER VALUES(?, ?)");
			pstmt.setInt(1, 100001);
			pstmt.setString(2, "Atul Dwivedi");
			int i = pstmt.executeUpdate();
			if(i > 0) {
				System.out.println("Record has been inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
