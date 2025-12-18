package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_1 {

	public static void main(String[] args) {
		

		List<Integer> list=Arrays.asList(10,20,30);
		
		
	Optional<Integer> ops=list.stream().reduce((i,j)->(i+j));
		
		ops.ifPresentOrElse(System.out::println, ()->{System.out.println("Empty list encounterd!");});
	}
}
