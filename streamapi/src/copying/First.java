package copying;

public class First {

	public static void main(String[] args) {
		
		 Student one=new Student(1,"Abc");
		 
		 Student two=new Student(one);
		 
	//	 System.out.println(one.name);
		  two.name="John";
		 
		 System.out.println(one.name);
		 System.out.println(two.name);
		
		
	}

}

class Student
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Student(Student st)
	{
		this.id=st.id;
		this.name=st.name;
	}
}