package com.wellnwill.jm2009.learn.jdbc.img;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class SaveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2009_PROFILE VALUES(?, ?)");

			FileInputStream fis = new FileInputStream("WebContent\\resources\\images\\tech-word-cloud.jpg");

			pstmt.setString(1, "John");
			pstmt.setBinaryStream(2, fis, fis.available());

			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Image has been inserted successfully.");
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
