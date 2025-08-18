package core3;

public class Staticdemo4 {

	public static void main(String[] args) {
		

		
		Car honda=new Car();
		  honda.price=1332.45;
		  honda.name="City";
		  
		  
		 
		Car skoda=new Car();
		   skoda.price=10000;
		   skoda.name="Rapid";
		   
//		   
//		   honda.display();
//		   skoda.display();
		   
		   
		   System.out.println(honda.name);
		   System.out.println(skoda.name);
		   
		   
		   skoda.display();
		   honda.display();
	}

}

class Car
{
   String name;
	double price;
	
	public  static void display()
	{
		System.out.println("Carrrrrrrrrrrrrrr.....");
	//	System.out.println(name);
		
	}
	
}