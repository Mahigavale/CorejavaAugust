package collections_class;

import java.util.Arrays;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		
		 List<String> list=Arrays.asList("abc","   ","       ","a","bcde");
		 
		 String stre="hello";
		 
		 
	 CheckArbitary ch=new CheckArbitary();
		 
		 //String=>
         list.stream().map(stre::concat)
         .map(String::toUpperCase)
         .map(String::length)   //Integer
         .map(ch::square)
         .forEach(System.out::println);
	}
}


class  CheckArbitary
{
	static int counter=1;
	   public   boolean der(String str)
	   {
		   System.out.println(++counter);
		   return  !str.isBlank();
	   }
	   
	   public  Integer square(Integer i)
	   {
		   return i*i;
	   }
}