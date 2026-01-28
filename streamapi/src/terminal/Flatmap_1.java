package terminal;

import java.util.ArrayList;
import java.util.List;

public class Flatmap_1 {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(23,56,21);
		List<Integer> list2=List.of(10,11,12);
		 
		List<List<Integer>> list3= List.of(list,list2);
		System.out.println(list3);
		 
		list3.stream()
		.peek((i)->{System.out.println("PeeK B"+i);})
		.flatMap((i)->(i.stream()))
		.peek((i)->{System.out.println("peek After:"+i);})
		.forEach(System.out::println);
		

	}

}
