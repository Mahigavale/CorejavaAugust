package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Limit_4 {

	public static void main(String[] args) {
		
		
		Student st=new Student(11,80.08);
		Student st2=new Student(12,98.89);
		Student st3=new Student(11,78.98);
		
		List<Student> list=new ArrayList<Student>();
		
		
		list.add(st);
		list.add(st3);
		list.add(st2);
		
		
		list.stream().sorted().distinct()
		.forEach((i)->{System.out.println(i.marks);});
	}

}

class Student implements Comparable<Student>
{
	int id;
	double marks;
	public Student(int id, double marks)
	{
		this.id=id;
		this.marks=marks;
	}
	
	
	public int hashCode()
	{
		return Objects.hash(this.id);
	}
	
	
	public boolean equals(Object o)
	{
		 Student st=(Student)o;
		 return this.id==st.id;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return Double.compare(this.marks, o.marks);
	}
}