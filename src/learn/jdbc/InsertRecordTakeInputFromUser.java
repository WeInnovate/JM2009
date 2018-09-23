package learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordTakeInputFromUser {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter ID: ");
			int id = Integer.parseInt(scan.nextLine());
			System.out.print("Please enter name: ");
			String name = scan.nextLine();

			int i = stmt.executeUpdate("INSERT INTO JM2009_JDBC_USER VALUES(" + id + ", '" + name + "')");
			if(i > 0) {
				System.out.println("Record inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
