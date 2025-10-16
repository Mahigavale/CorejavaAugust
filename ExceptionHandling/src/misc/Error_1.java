package misc;

import java.util.ArrayList;
import java.util.List;

public class Error_1 {
	static long counter2 = 1;

	public static void demo(int i) throws InterruptedException {
		
		
		
		System.out.println(counter2++);
		demo(i);
	}

	public static void main(String[] args) throws Exception {
		
		
		
		try {
			while(true) {
		
		Error_demo.sdemo();
			}
		}
		catch(Error er)
		{
			System.out.println(er.getMessage());
		}
		finally
		{
			System.out.println("in the finally of the so");
			Error_demo.sdemo();
		}
		
		
		
		try
		{
			while(true) {
			Error_demo.error();
			}
		}
		catch(Error er)
		{
			System.out.println(er.getMessage());
		}
		
		finally
		{
			System.out.println("in the finally");
			Error_demo.error();
		}
		

	}

}

class Student_demo {
	int id;
	String name;
	String email;

	public Student_demo(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
}

class Error_demo {
	public static void error()
	{
		int id = 1;
		
		String name = "A";
		
		String email = "A@";
		
		List<Student_demo> unique = new ArrayList<Student_demo>();
		long counter=1;

		try
		{
			while (true) {
				unique.add(new Student_demo(id, name, email));

				id++;
				name = name + ",";
				email = email + ".";

				System.out.println();
				counter++;

				System.out.println(counter);
			}
		}catch(
		Error ex)
		{
			System.out.println(ex.getMessage());
		}finally
		{

			System.out.println("in finally");
			while (true) {
				unique.add(new Student_demo(id, name, email));

				id++;
				name = name + ",";
				email = email + ".";

				System.out.println();
				counter++;

				System.out.println(counter);
			}
		}
	}
	
	
	
	public static void sdemo() throws InterruptedException
	{
		 Error_1.demo(1);
	}
	}

