package com.wellnwill.jm2009.learn.jdbc.batch.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class InsertBulkOfRecordsUsingPreparedStatement {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2009_USER VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				
				pstmt.addBatch();

				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] arr = pstmt.executeBatch();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					System.out.println("Record number " + (i + 1) + " has been inserted successfully.");
				} else {
					System.out.println("Record number " + (i + 1) + " has not been inserted successfully.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
