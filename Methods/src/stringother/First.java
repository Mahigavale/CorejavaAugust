package stringother;

import java.lang.reflect.Method;

public class First {

	public static void main(String[] args) {
		

		//String =>Immutable
		//StringBuilder =>mutable
		//StringBuffer =>Mutable
		
		StringBuilder sb=new StringBuilder("Abc"); //"ABC"
		
	 sb.append("DEF"); //"ABC""DEF"
	   
	 System.out.println(sb); //
	 System.out.println(sb.reverse());
	 System.out.println(sb);
		
	 
	 
	 
	 
	}

}
