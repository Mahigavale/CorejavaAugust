package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Limit_Skip_3 {

	public static void main(String[] args) {
		
		List<Emp> uss=new ArrayList<Emp>();
		
		uss.add(new Emp("IT",34567.76));
		uss.add(new Emp("HR",1212.12));
		uss.add(new Emp("IT",55555.67));
		uss.add(new Emp("HR",3333.333));
		
		//dept 2nd highest. =>
		//highest or lowest => different depts.
		
		
		//Second highest in the same 
		//Highest or lowest departmentwise.
		
//		List<Emp> list1=uss.stream().filter((i)->(i.dept.equals("IT")))
//				.collect(Collectors.toList());
//		
//		List<Emp> list2=uss.stream().filter((i)->(i.dept.equals("HR")))
//				.collect(Collectors.toList());
		
		
		System.out.println("IT");
		list1.stream().sorted(new EmpSalary()).limit(2).skip(1).forEach((i)->{
			System.out.println(i);
		});
		
		
		System.out.println("HR");
		list2.stream().sorted(new EmpSalary()).limit(2).skip(1).forEach((i)->{
			System.out.println(i);
		});
		}
				
		
	}




class Emp
{
	
	String dept;
	double salary;
	public Emp(String dept, double salary)
	{
		this.dept=dept;
		this.salary=salary;
	}
	
	public int hashCode()
	
	{
		return Objects.hash(this.dept);
	}
	
	public boolean equals(Object o)
	{
		Emp e=(Emp)o;
		return this.dept.equals(e.dept);
	}
	
	
	@Override
	public String toString() {
		return "Emp [dept=" + dept + ", salary=" + salary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

class EmpSalary implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return Double.compare(o2.salary,o1.salary);
	}
	
}