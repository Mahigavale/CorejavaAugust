package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
	/**
	 * Dynamic Queries.
	 */
	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("id:");
	int id=scan.nextInt();
	System.out.println("name:");
	String name=scan.next();
	 PreparedStatement ptmt=con.prepareStatement("insert into student values(?,?)");
	 
	 ptmt.setInt(1, id);
	 ptmt.setString(2, name);
	 
	 
	    System.out.println("rows badalale:"+ ptmt.executeUpdate());
	    
	    scan.close();
	    con.close();
	    ptmt.close();
	 

	}

}
