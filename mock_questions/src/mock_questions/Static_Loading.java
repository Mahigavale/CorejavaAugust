package mock_questions;

import java.util.Comparator;

public class Static_Loading {

	
	//Comparable<>
  
//	Comparator<T>
//	  static private char c=str.charAt(0);
	public static void main(String[] args) {	
		System.out.println(str.charAt(0));
 System.out.println("hii");
 
	}

	static private String str="null";
	static
	{
		System.out.println("hii1");
	}
	static
	{
		System.out.println("hello");
	}
}
