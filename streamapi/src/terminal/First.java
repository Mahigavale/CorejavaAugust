package terminal;

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
import java.util.stream.Collectors;

public class First {

	public static void main(String[] args) {
		

		List<Integer> list=Arrays.asList(10,20,30,40,40,50,50,30,33,45,11,40,50,111);	
		
		 
//		List<String> list2=Arrays.asList("abc","def","ghi");
//		
//		 
//		System.out.println(list.getClass()==list2.getClass());
//		
		
		
		
		
		List<Integer> sum=list.stream()
				.filter((i)->(i%2!=0)).collect(Collectors.toList());
		
		 System.out.println("EVEN:"+sum.getClass());
		 Set<Integer> set=list.stream().collect(Collectors.toSet());
		 
		 System.out.println("UNIQUE:"+set.getClass());
	
	
	
	}

} 
                                        //T           A           R
class Integer_adder implements Collector<Integer, List<Integer>, List<Integer>>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		
		return  ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		 return (list, in)->{
			 if(in %2 !=0)
			 {
				 list.add(in);
			 }
		 };
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		
		System.out.println("A");
		return null;
	}

	@Override
	public Function<List<Integer>,List< Integer>> finisher() {
		
		return (list)->(list);
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return new HashSet<Collector.Characteristics>(); 
	}
	
}

