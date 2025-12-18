package copying;

public class Shallow_Copy {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee emp=new Employee(23, "Peter", "CString");
		
		Employee emp2=(Employee)emp.clone();
		
		
		
	//	System.out.println(emp.clone() !=emp);
		
		emp2.name="john";
		System.out.println(emp);
		System.out.println(emp2);
		
		
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
	}

}

/**
 * Eligible for Cloning.
 */
class Employee implements Cloneable
{
	int id;
	String name;
	String city;
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		System.out.println("hii");
	}
	
	
	protected Object clone() throws CloneNotSupportedException
	{
//		int id=this.id;
//		String name=this.name;
//		String city=this.city;
//		
//		Employee emp2=new Employee(id, name , city);
//		return emp2;
		
		return  super.clone();
	}
	
	public String toString()
	{
		return this.name+" "+this.id;
	}
	
 
}