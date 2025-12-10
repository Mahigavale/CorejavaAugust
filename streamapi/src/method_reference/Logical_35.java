package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Logical_35 {

	public static void main(String[] args) {
		//new String().compareTo(new String())0,1,-1
		
		
		List<String> list=Arrays.asList("abcd","abcde","abcdef","abcdefg");
		
		SquareDecider sq=new SquareDecider();
		
		list.stream().map(String::length)
		.map(SquareDecider::square)
		.forEach(System.out::println);

	
	}

}
class SquareDecider
{
	public  static Integer square(Integer i)
	{
		return i*i;
	}
}
