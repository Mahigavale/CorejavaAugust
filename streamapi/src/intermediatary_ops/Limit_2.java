package intermediatary_ops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Limit_2 {

	public static void main(String[] args) {
		
		
		List<Employee> uss=new ArrayList<Employee>();
		
		uss.add(new Employee(1,"John peter","IT",7890.78));
		uss.add(new Employee(2," peter Parker","HR",7890.78));
		uss.add(new Employee(3,"Gabriel Lomez","IT",71111.78));
		uss.add(new Employee(4,"Angel Doctor","HR",8989.90));
		uss.add(new Employee(5,"Shaun Pollock","IT",9999.78));
		uss.add(new Employee(6,"Andrew Symonds","HR",2222.34));

		
		uss.stream()
		.sorted()
		.distinct()
	
		.forEach((i)->{System.out.println(i);});
		
		
		
		System.out.println(
		new Employee(1,"John peter","IT",7890.78).hashCode()+" :"+
		new Employee(2," peter Parker","HR",7890.78).hashCode()+
				":"+
		new Employee(3,"Gabriel Lomez","IT",71111.78).hashCode()+
				":"+
		new Employee(4,"Angel Doctor","HR",8989.90).hashCode()+":"+
		new Employee(5,"Shaun Pollock","IT",9999.78).hashCode()+":"+
		new Employee(6,"Andrew Symonds","HR",2222.34).hashCode());
		
		/**
		 * I found the second highest paid employee.
		 */
		
	}
}

class Employee  implements Comparable<Employee>
{
	 int id;
	 String name;
	 String dept;
	 double salary;
	 public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	 }
	
	 
	 
	 
	 public int hashCode()
	 {
		// System.out.println(Objects.hash(this.dept));
		 return Objects.hash(this.dept);
	 }
	 
	 
	 public boolean equals(Object o)
	 {
		 Employee e=(Employee)o;
		 boolean result= this.dept.equals(e.dept);
		 System.out.println(result);
		 return result;
	 }
	 public int compareTo(Employee o) {
		
		 return Double.compare(this.salary,o.salary);
	 }
	 
	 public String toString()
	 {
		 return this.salary+" "+this.name+" "+this.dept;
	 }
	 
}

//class SalaryComparator implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//
//return  Double.compare(o2.salary, o1.salary);
//	}
//	
//}