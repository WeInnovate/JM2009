package com.wellnwill.jm2009.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class UpdateMulitpleRecordsUsingPstmt {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2009_USER SET NAME = ? WHERE ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());
				System.out.print("Please enter New Name: ");
				String name = scan.nextLine();

				pstmt.setInt(2, id);
				pstmt.setString(1, name);

				int i = pstmt.executeUpdate();

				if (i > 0) {
					System.out.println("Record has been updated successfully.");
				}

				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
