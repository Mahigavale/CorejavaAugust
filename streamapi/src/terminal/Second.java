package terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,40,50,50,30,33,45,11,40,50,111);	

		
	 Set<Integer> set=list.stream().collect(new List_TO_Set());
	 System.out.println(set);
	 
	 System.out.println(list.stream().collect(Collectors.toSet()));
	}
}

class List_TO_Set implements Collector<Integer, List<Integer>, LinkedHashSet<Integer>>{

	@Override
	public Supplier<List<Integer>> supplier() {
	System.out.println("Supplying the LIst.");
	 return ArrayList::new ;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		 
		System.out.println("Adding the elements in the list...");
		return (list, i)->{list.add(i);};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		
		System.out.println("Combining the multiple lists...");
		
		  return (l,L)->{
			  l.addAll(L);
			  return l;
		  };
	}

	@Override
	public Function<List<Integer>, LinkedHashSet<Integer>> finisher() {
	
		System.out.println("Converting List to LinkedHashSet<Integer>");
		
	  return (list)->(new LinkedHashSet<Integer>(list));
			
	}

	@Override
	public Set<Characteristics> characteristics() {
	  return new LinkedHashSet<Collector.Characteristics>();
	}
	}