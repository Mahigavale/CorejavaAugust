package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapFunction {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(233);
		list.add(3478);
		list.add(11);
		list.add(78098);
		list.add(60);
		
		//(i)->("A"+i)
		//(i)->{return "A"+i;};
		
		list.stream().map((i)->(""+i))
		.filter((i)->{return i.length()>3;})
		.forEach((i)->{System.out.println(i);});

	}

}
//
////IS-A FUNCTION.
//class converttostring implements Function<Integer, String>
//{
//	
//	
//	public String apply(Integer t) {
//		
//		return "A"+t;
//	}
//}
