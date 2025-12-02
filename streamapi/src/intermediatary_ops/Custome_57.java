package intermediatary_ops;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Custome_57 {

	public static void main(String[] args) {
	
		
		Set<Student_3> uss=new TreeSet<Student_3>();
		
		
		uss.add(new Student_3(1,"mahehs",45.67));
		uss.add(new Student_3(2,"Shivam",89.98));
		uss.add(new Student_3(-1,"dada",88.09));
		uss.add(new Student_3(21,"Shivamaa",89.98));
		
		System.out.println(uss);

	}

}

class Student_3 implements Comparable<Student_3>
{
	int id;
	String  name;
	double marks;
	public Student_3(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student_3 o) {
		
		return Double.compare(this.marks, o.marks);
	}
	
	
	public int hashCode()
	{  System.out.println("hii");
		return Objects.hash(this.name);
	}
	
	public boolean equals(Object o)
	{
		 Student_3 st3=(Student_3)o;
		 
		 return this.name.equals(st3.name);
	}

	public String toString()
	{
		return this.name+" "+this.marks;
	}
}