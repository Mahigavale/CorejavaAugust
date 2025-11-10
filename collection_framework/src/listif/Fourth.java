package listif;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fourth {

	public static void main(String[] args) {
		
		List<Student> uss=new ArrayList();
		
		uss.add(new Student(1,"abc","abc@gmail.com"));
		
		uss.add(new Student(2,"cde","cde@gmail.com"));
		
		System.out.println(uss);
		
	// System.out.println(uss.contains(new Student(1,"abc","abc@gmail.com")));

	 /**
	  * St reference present in uss.
	  */
	 
		
	 //[st1,st2]=> [st:st1],[st:st2],[st:st3]
	 for(Student st: uss)
	 {
		
		 if(st.getName().equals("abc"))
		 {
			 st.setEmail("xyz@gmail.com");
		 }
	 }
	 
	 System.out.println(uss);
	}

}

class Student
{
	int id;
	String name;
	String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	
	public String toString()
	{
		return this.id +" "+this.name+" "+this.email;
	}
	
	public boolean equals(Object o)
	{
		Student st=(Student)o;
		
		return this.name.equals(st.getName()) && this.id==st.id && this.email.equals(st.getEmail());
	}
	
	
	public int hashCode()
	{
		return Objects.hash(this.email,this.id,this.name);
	}
	
}