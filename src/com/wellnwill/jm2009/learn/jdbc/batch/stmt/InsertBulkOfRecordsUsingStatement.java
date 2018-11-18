package com.wellnwill.jm2009.learn.jdbc.batch.stmt;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class InsertBulkOfRecordsUsingStatement {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter name: ");
				String name = scan.nextLine();

				stmt.addBatch("INSERT INTO JM2009_USER VALUES(" + id + ", '" + name + "')");

				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] arr = stmt.executeBatch();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					System.out.println("Record number " + (i+1) + " has been inserted successfully.");
				} else {
					System.out.println("Record number " + (i+1) + " has not been inserted successfully.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
