package collections_class;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Demo_List_1 {

	public static void main(String[] args) {
		
	Integer even=	List.of(11,21,43,54,32,10,11).stream().collect(new Even_Collector());
	
	System.out.println(even);
	}
}

class Even_Collector implements Collector<Integer, List<Integer>, Integer>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		// TODO Auto-generated method stub
		
		System.out.println("Calling supplier to provide a accumulator::");
		return ()->(new ArrayList<Integer>());
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		     return   (list,u)->
		     {
		    	 if(u%2==0)
		    	 {
		    		 list.add(u);
		    	 }
		    	
		     };
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		 return    (list1,list2)->{
			    list1.addAll(list2);
			    return list1;
		   };
	}

	@Override
	public Function<List<Integer>, Integer> finisher() {
		  return   (list)->{
			  int sum=0;
			  for(int i:list)
			  {
				  sum+=i;
			  }
			  return sum;
		  };
	}  

	@Override
	public Set<Characteristics> characteristics() {
		return new HashSet<Collector.Characteristics>();
	}
	
}
