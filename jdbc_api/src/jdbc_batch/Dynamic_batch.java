package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Dynamic_batch {

	public static void main(String[] args) throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		
			PreparedStatement stmt=con.prepareStatement("insert into student values(?,?);");
			
			 con.setAutoCommit(false);
			Scanner scan=new Scanner(System.in);
			int count=1;
			while(count<4) {
			System.out.println("Id:");
			int id=scan.nextInt();
			System.out.println("Name:");
			String name=scan.next();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.addBatch();
			count++;
			}
			
		int[] arr=stmt.executeBatch();
		
		Thread.sleep(25000);
		System.out.println("Commiting the changes.....");
		   con.commit();
		
		for(int i:arr)
		{
			System.out.println(i);
		}

		 con.close();
		 stmt.close();
	}

}
