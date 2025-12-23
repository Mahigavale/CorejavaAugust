package terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class grpby {

	public static void main(String[] args) {


		List<String> list=List.of("avc","abcd","pqrs","abcde","ikjlm");
		
		
		
	 Map<Object, List<String>>	map=list.stream().collect(Collectors.groupingBy((i)->(i.startsWith("a"))));
	 
	 System.out.println(map);
	}

}
