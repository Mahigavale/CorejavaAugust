package callable_use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;


public class Second {

	public static void main(String[] args) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root"); 

		
		 CallableStatement call =con.prepareCall("{call changeid(?)}");
		 
		 call.setInt(1, 5);
		 
		 call.registerOutParameter(1, Types.INTEGER);
		 
		  ResultSet set=call.executeQuery();
		  
		  while(set.next())
		  {
			  System.out.println(set.getInt(1));
		  }
	}

}
