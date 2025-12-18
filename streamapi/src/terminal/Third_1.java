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

public class Third_1 {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("hello", "galelio","eureka","jadhav");
		
	
		System.out.println(list);
		List<StringBuffer> sb=list.stream().collect(new String_Concater());
		
		System.out.println(sb);
	}

}

class String_Concater implements Collector<String, StringBuffer,List< StringBuffer>>
{

	@Override
	public Supplier<StringBuffer> supplier() {
		return StringBuffer::new;
	}

	@Override
	public BiConsumer<StringBuffer, String> accumulator() {
		return (sb,s)->{sb.append(s);};
	}

	@Override
	public BinaryOperator<StringBuffer> combiner() {
		return (sb,sb2)->{
			sb.append(sb2);
			return sb;
		};
	}

	@Override
	public Function<StringBuffer,List< StringBuffer>> finisher() {
	
	    List<StringBuffer> list=new ArrayList<StringBuffer>();
		
	   return (i)->{  list.add(i);
	   return list;};
	}

	@Override
	public Set<Characteristics> characteristics() {
		
		return new HashSet<Collector.Characteristics>();
	}
	
}
