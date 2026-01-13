package callable_use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;



public class First {

	public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","root");
		
		// CallableStatement call=con.prepareCall("{call getbyidname(?,?)}");
		 
//		 call.setInt(1, 2);
//		 call.setString(2, "def");
		
		
		/**
		 * Out ParaMeter
		 */
		
		// CallableStatement call=con.prepareCall("{call getcount(?)}");
		 
	//	 call.registerOutParameter(1,Types.INTEGER);
		
		 CallableStatement call=con.prepareCall("{call getavg(?)}");
		 
			 call.registerOutParameter(1,Types.DOUBLE);
		 ResultSet set=call.executeQuery();
		 
		   while(set.next())
		   {
		     System.out.println("Average:"+set.getDouble(1));
		   }
		 
		// System.out.println("count:"+count);
//		 while(set.next())
//		 {
//			
//			 System.out.println(set.getInt(1));
//			 System.out.println("************************");
//		 }
		 con.close();
		 call.close();
		
	}

}
