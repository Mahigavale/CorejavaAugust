package map_Interface;

import java.util.Comparator;
import java.util.TreeMap;

public class Tree_Map_Custom {

	public static void main(String[] args) {
		
		
		TreeMap<Student, Double> tree=new TreeMap<Student, Double>();
		
		tree.put(new Student(1,"Angelina", 98.0), 123.0);
		tree.put(new Student(1,"Julie",98.0), 125.0);
		tree.put(new Student(3,"Peter",97.0), null);
		
		System.out.println(tree);
	}

}

class Student implements Comparable<Student>
{
	
	int id;
	String name;
	double marks;
	
	public Student(int id, String name, double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	
	public int compareTo(Student o) {
		
		return Double.compare( this.marks, o.marks);
	}
	
	public String toString()
	{
		
		return this.id +" "+ this.name+" "+this.marks;
	}
}


class IdComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.id,o2.id);
	}
	
}