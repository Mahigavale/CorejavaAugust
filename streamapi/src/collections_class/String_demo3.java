package collections_class;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class String_demo3 {

	public static void main(String[] args) {

	Map<Integer,List<String>> map=List.of("add","abc","xyz","shdsdbsj","dsknkw")
		  .stream().collect(Collectors.groupingBy((s)->(s.length())));
	

	System.out.println(map);
	
	
	        Map<String,List<Employee>>m2=List.of(new Employee("IT",1111,"JOHN"),new Employee("IT",11575,"Max"),new Employee("HR",2222,"PETER"),new Employee("IT",5555,"Alaska"),new Employee("HR",4444,"GOLDY"),new Employee("HR",11118,"Aarushi"))
	               .stream().collect(Collectors.groupingBy((e)->(e.getDept())));
	
	        System.out.println(m2);
	        
	        for(java.util.Map.Entry<String, List<Employee>> entry:m2.entrySet())
	        {
	        	
	        	entry.getValue().stream().sorted((a,b)->(Double.compare(a.getSalary(), b.getSalary()))).limit(2).skip(1).forEach((e)->{
	        		System.out.println(e.getName());
	        		System.out.println(e.getSalary());
	        		System.out.println(e.getDept());
	        		System.out.println("****************8");
	        	});
	        }
	}

}

class String_Collector implements Collector<String, List<Integer>, List<Integer>>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		// TODO Auto-generated method stub
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, String> accumulator() {
		return (list,s)->{
			list.add(s.length());
		};
		
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		return (sb,sb2)->{
			System.out.println("calling the combiner.....");
			 sb.addAll(sb2);
			 return sb;
		};
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		 return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		HashSet<Characteristics>  set=new HashSet<Characteristics>();
		set.add( Characteristics.IDENTITY_FINISH);
		return set;
	}
	
}

class MapCollector implements Collector<String, LinkedHashMap<Integer,String>, LinkedHashMap<Integer,String>>
{

	@Override
	public Supplier<LinkedHashMap<Integer, String>> supplier() {
		  return () ->(new LinkedHashMap<Integer, String>());
	}

	@Override
	public BiConsumer<LinkedHashMap<Integer, String>, String> accumulator() {
		return (t,s)->{
			t.put(s.length(), s);
		};
	}

	@Override
	public BinaryOperator<LinkedHashMap<Integer, String>> combiner() {
		      return(m,u)->{
		    	  m.putAll(u);
		    	  return m;
		      };
	}

	@Override
	public Function<LinkedHashMap<Integer, String>, LinkedHashMap<Integer, String>> finisher() {
		return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		 return new HashSet<Collector.Characteristics>();
	}
	
}


class Employee
{
	String dept;
	double salary;
	String name;
	public Employee(String dept, double salary, String name) {
		super();
		this.dept = dept;
		this.salary = salary;
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
	
}
