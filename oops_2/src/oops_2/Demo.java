package oops_2;

public class Demo {

	public static void main(String[] args) {
		

		Tiger tiger=new Tiger();
		
		tiger.demo();
		
	
	}

}

interface I_animal
{
	
	int id=23;
	//Sf
	void eat();
	
	void run();
	//PA
	
	
	public default void demo()
	 {
		 System.out.println("hello from animal");
	 }
}

interface I_plant 
{
	void breathe();
	
	default void demo()
	{
		System.out.println("hello from plant");
	}
	
}

class Tiger implements I_animal, I_plant
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void demo()
	{
		 I_animal.super.demo();
		 I_plant.super.demo();
	}
	

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class Fox implements I_animal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}