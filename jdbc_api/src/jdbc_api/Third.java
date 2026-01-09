package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the query::");
		String str=scan.nextLine();
		Properties prop=new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2",prop);
		
		
		Statement ptmt=con.createStatement();
		
		//String str="select * from student";
		      boolean  set=ptmt.execute(str);
		        
		      System.out.println(set);

		      
              
		      if(!set)
		      {
		    	 // int i=ptmt.executeUpdate(str);
		    	  System.out.println("no of rows affected...not needed but data added or changed...");
		      }
		      
		      else
		      {
		    	   ResultSet rs=ptmt.executeQuery(str);
		    	   
		    	   while(rs.next())
		    	   {
		    		   System.out.println(rs.getInt(1));
		    		   System.out.println(rs.getString(2));
		    	   }
		      }
       //Dql => execute() =>True
		     // False 
                     
                       con.close();
	}
	
	
}
