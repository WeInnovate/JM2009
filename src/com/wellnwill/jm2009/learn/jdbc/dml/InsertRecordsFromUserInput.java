package com.wellnwill.jm2009.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.wellnwill.jm2009.learn.jdbc.util.DbUtil;

public class InsertRecordsFromUserInput {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getDatabaseConnection();
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while(userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());
				System.out.print("Enter Name: ");
				String name = scan.nextLine();
				
				int i = stmt.executeUpdate("INSERT INTO JM2009_USER VALUES(" + id + ", '" + name + "')");
				if (i > 0) {
					System.out.println("Record inserted successfully.");
				}
				System.out.print("Do you wish to continue...(Y/N): ");
				userChoice = scan.nextLine();
			}
			

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
