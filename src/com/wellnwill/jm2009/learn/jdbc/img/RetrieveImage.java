package com.wellnwill.jm2009.learn.jdbc.img;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class RetrieveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2009_PROFILE WHERE NAME = 'John'");
			rs.next();

			String name = rs.getString(1);
			System.out.println(name);

			Blob b = rs.getBlob(2);
			byte[] bArr = b.getBytes(1, (int) b.length());

			FileOutputStream fos = new FileOutputStream("WebContent\\resources\\images\\output\\tech-word-cloud.jpg");
			fos.write(bArr);
			fos.close();

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
