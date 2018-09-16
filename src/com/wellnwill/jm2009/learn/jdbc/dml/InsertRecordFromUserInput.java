package com.wellnwill.jm2009.learn.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordFromUserInput {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			System.out.print("Enter ID: ");
			int id = Integer.parseInt(scan.nextLine());
			System.out.print("Enter Name: ");
			String name = scan.nextLine();

			int i = stmt.executeUpdate("INSERT INTO JM2009_USER VALUES(" + id + ", '" + name + "')");
			if (i > 0) {
				System.out.println("Record inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
