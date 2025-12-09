package terminal_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Second {

	public static void main(String[] args) {
		
		 Supplier<List<Integer>> list=ArrayList::new;
		 
		 
		 IgetString<Student> ig=Student::new;
		 
		 System.out.println(ig.getStringObject(new Student(),new Student()));
		 
		 
		 


	}

}

interface IgetString<T>
{
	T  getStringObject(T t1, T t2);
}
class Student
{
	int id;
	String name;
}
