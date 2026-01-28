package terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapper {

	public static void main(String[] args) {
		
		
	 Map<Integer, String> mp=List.of("abcs","aaaaa","bbbbbb","xyza")
		.stream()
		.collect(Collectors.toMap((i)->(i.length()), (i)->(i),(a,b)->(a)));
	 
	 System.out.println(mp);
	 
 Map<Integer,List<String>> mp2=	 List.of("abcs","aaaaa","bbbbbb","xyza")
		.stream()
		.collect(Collectors.groupingBy((i)->(i.length())));
 
 System.out.println(mp2);
	}

}
