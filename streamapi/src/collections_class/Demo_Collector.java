package collections_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Demo_Collector {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,24,3,5,6,8,7);
		
	int result=list.parallelStream().collect(new Numbers_Collector());
	
	System.out.println("result:"+result);
	
	}

}

class Numbers_Collector implements Collector<Integer, List<Integer>, Integer>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		
		System.out.println("Calling the supplier to invoke the new List Each Time");
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		
		return (list, i)->{
			
			System.out.println("List:"+list);
			
			if(i%2==0)
			{
				list.add(i);
			}
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		
		return (list1, list2)->{
			System.out.println("List1:"+list1);
			System.out.println("List2:"+list2);
			list1.addAll(list2);
			
			
			System.out.println("added List:"+list1);
			return list1;
		};
		 
	}

	@Override
	public Function<List<Integer>, Integer> finisher() {
		return (list)->
		{
			int sum=0;
			System.out.println("sum:"+sum);
			
			for(int i:list)
			{
				sum=sum+i;
			}
			return sum;
		};
	}

	@Override
	public Set<Characteristics> characteristics() {
		
		return new HashSet<Collector.Characteristics>();
	}

	
}