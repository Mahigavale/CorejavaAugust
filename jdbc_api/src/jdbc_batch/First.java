package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		
		 Statement stmt=con.createStatement();
		 
		 String first="insert into student values(1,'atharva'),(4,'Rashmika');";
		 String second="insert into student values(2,'Ghatage');";
		 String third="insert into student values(3,'radhika');";
		 
		 
		 
		   stmt.addBatch(first);
		   stmt.addBatch(third);
		   stmt.addBatch(second);
		   
		    int[] arr=stmt.executeBatch();
		    
		    
         
		    
		    for(int i: arr)
		    {
		    	System.out.println(i);
		    	
		    }
		     
		     con.close();
		     stmt.close();
		   
		 
		
	}

}
class Student 
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
