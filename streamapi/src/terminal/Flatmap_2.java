package terminal;

import java.util.List;
import java.util.stream.Collectors;

public class Flatmap_2 {

	public static void main(String[] args) {
		List<Integer> l1=List.of(5,10,15);
		List<Integer> l2=List.of(10,15,20);
		
		
		List<Integer> l3=List.of(10,10,10);
		
		List<List<Integer>> l4=List.of(l1,l2);
		
		List<List<Integer>> l5=List.of(l3);
		
		
		List<List<List<Integer>>> l6=List.of(l4,l5);
		
		
		System.out.println(l6);
		
		
	 long l7=l6.stream()
		.flatMap((i)->(i.stream()))
		.flatMap((i)->(i.stream()))
		.reduce(0,(i,j)->(i+j));
		

	 System.out.println(l7);
	}

}
