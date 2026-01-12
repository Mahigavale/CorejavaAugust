package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Fourth {

	public static void main(String[] args) throws Exception {
		
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?);");
		int count =1;
		while(count<1500) {
		stmt.setInt(1, count);
		stmt.setString(2, "A"+count);
		stmt.addBatch();
		count++;
		if(count %15==0)
		{
			System.out.println("batch full:executing the batch....");
			long[] arr=stmt.executeLargeBatch();
			for(long l:arr)
			{
				System.out.println(l);
			}
		}
	}
		
	con.close();
	stmt.close();
	}
	
	          
}
