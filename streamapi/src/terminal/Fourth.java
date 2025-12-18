package terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;



public class Fourth {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(11,11,333,333,444,555,555);
		
		
	System.out.println(list.stream().collect(new List_to_map()));
		  

		 
	}

}

class List_to_map implements Collector<Integer, List<Integer>, Map<Integer, Integer>>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		
		return ArrayList::new;
	}
	

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		
		return (list, in)->{
			if(in%2==0) {
			list.add(in);}};
			}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		
		return (list1, list2)->{
			list1.addAll(list2);
			return list1;
		};
	}

	@Override
	public Function<List<Integer>, Map<Integer, Integer>> finisher() {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		return(list)->{
			int counter=1;
			for(int i:list)
			{
				map.put(counter, i);
				counter++;
			}
			return map;
		};
	}

	@Override
	public Set<Characteristics> characteristics() {
		return new HashSet<Collector.Characteristics>();
	}
	
}