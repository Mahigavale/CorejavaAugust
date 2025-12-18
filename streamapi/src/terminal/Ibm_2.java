package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Ibm_2 {

	public static void main(String[] args) {
		

		List<Integer> list=Arrays.asList(1111,2,42,234,1123,13,null,643,null,1908,1,null,5678);
		
		
 List<Integer>list2=list.stream().filter(checknonull::check)
		 .map(checknonull::toSt)
		 .filter((i)->{return i.startsWith("1");})
		 .map(Integer::parseInt)
		 .collect(Collectors.toList());

   System.out.println(list2);

		//Objects.requireNonNull(null)
	 

	}

}
class checknonull 
{
	public static boolean check(Integer I)
	{
		if(I==null)
		{
			return false;
		}
		return true;
	}
	public static String toSt(Integer I)
	{
		return I.toString();
	}
}
