package fifs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Fiifs_colle {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(23);
		list.add(35);
		list.add(67);
		list.add(11);
		
		System.out.println(list);
		
		System.out.println("******************************");
		
		Consumer<List<Integer>> cons=(i)->
		{
			 for(int j:i)
			 {
				 System.out.println(j);
			 }
		};
		
		cons.accept(list);
		
		/**
		 * =====================================================
		 */
		System.out.println("*************************************");
		
		Predicate<List<Integer>> pred=(i)->
		{
			return list.size()>=5;
		};
		
		System.out.println(pred.test(list));

		/**
		 * ================================================
		 */
		
		System.out.println("****************************************");
		Function<List<Integer>, Integer> fun=(i)-> {return i.size();};
		
		System.out.println(fun.apply(list));
	}

}
