package mock_questions;

import java.util.Arrays;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {
    
		
		List<StringBuffer> list=Arrays.asList(new StringBuffer("aBC"), new StringBuffer("CDE"));
		
		
		list.stream().map(StringConverter::change)
		.forEach(System.out::println);

	}

}

//class ChartoString
//
//{
//	
//	public static String charre(Character c)
//	
//	{
//		return c.toString();
//	}
//			
//}
class StringConverter
{
	public static String change(StringBuffer sb)
	{
	
		//[0,1,2]
		   Character c=sb.charAt(1);
		     String st=c.toString().toLowerCase();
			 return  sb.replace(1, 2, st).toString();
	}
	
}
