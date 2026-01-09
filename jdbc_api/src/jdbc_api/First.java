package jdbc_api;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class First {

	public static void main(String[] args) throws ClassNotFoundException {
		 Class.forName("com.mysql.cj.jdbc.Driver");

		 Scanner scan=new Scanner(System.in);
		// step=> opening a connection.jdbc2

		 //PrepareStateMent
		 int id;
		 System.out.println("Please enter the id:");
		 id=scan.nextInt();
		 System.out.println("please enter the name:");
		 String name=scan.next();
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2", prop);
				Statement stmt = con.createStatement();) {
			System.out.println("connection opened!");

			int n = stmt.executeUpdate("insert into Student values()");

			System.out.println("no of rows affected..."+n);
			Integer i1=128;
			Integer i2=128;
			System.out.println(i1==i2);

		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

}
