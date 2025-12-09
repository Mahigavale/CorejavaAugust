package collections_class;

import java.util.Arrays;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		
List<String> list=Arrays.asList("I","Am","The","Best");
		
		
//		list.stream().map(StringBuffer::new)
//		.map(StringBuffer::reverse)
//		.map(String::new)
//		.map(String::toUpperCase)
//		.forEach(System.out::println);
//		 
//		//map()=>Function<String,StringBuffer> fun=(i)->(new StringBuffer(i))

		
		
	}
}

class  Student
{
	int id;
	String name;
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String getdetails()
	{
		return this.id+" "+this.name;
	}
}

interface I_obj <T>
{
	T red(int i, String name);
}