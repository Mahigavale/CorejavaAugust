package equalsmethod;

import java.util.Objects;

public class First_1 {

	public static void main(String[] args) {
		

		Aeroplane ae=new Aeroplane();
		
		ae.engine=45.90;
		ae.name="Boeing";
		ae.seats=10;
		
		System.out.println(ae.hashCode());
		Aeroplane ae2=new Aeroplane();
		
		ae2.engine=45.90;
		ae2.name="Bo";
		ae2.seats=1;
		
		
		System.out.println(ae2.hashCode());
		
		System.out.println(ae.equals(ae2));
		
		
	}

}


class Aeroplane
{
	static int counter=1;
	
	
	public Aeroplane()
	{
		++counter;
	}
	
	String name;
	  double engine;
	  int seats;
	
	 public int hashCode()
	 {
		return  100;
	 }
	 
	 public boolean equals(Object obj)
	 {
		 Aeroplane ae3=(Aeroplane)obj;
		 
		 
		 return(this.engine==ae3.engine && this.name.equals(ae3.name)&&this.seats==ae3.seats);
	 }
}