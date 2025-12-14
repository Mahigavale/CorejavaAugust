package misc2;

import java.util.Arrays;
import java.util.List;

public class Bi3 {

	public static void main(String[] args) {
		// Abc, EFg, xyz, ijk, pqwowdl,owdwinx,xkwjsowqksq ,aaqq
		
		
		List<String> list=Arrays.asList("Abc", "EFg", "xyz", "Ajk", "pqwowdl","Awdwinx","xkwjsowqksq" ,"Aaqq");
		
		Integer square=list.stream()
				.filter(checkVowels::checkString)
				.peek(System.out::println)
				.map(StringBuffer::new)
				.map(StringBuffer::reverse)
				.peek((i)->{System.out.println(i.length());})
				.map(StringBuffer::toString)
				.map(String::length)
				.reduce(0, (i,j)->(i+(j*j)));
		
		
		System.out.println(square);

	}

}

class checkVowels
{
	public static boolean checkString(String str)
	{
		
		return  str.startsWith("A") || str.startsWith("E");
	}
}
