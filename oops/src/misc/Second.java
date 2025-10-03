package misc;

public class Second {

	public static void main(String[] args) {
		
		
		nano na=new nano();
		na.eat();
		na.run();
	}

}

interface I_car
{
	int add(int i, int j);
	
	public static void run()
	{
		System.out.println("I am running....");
	}
	
	public default void eat()
	{
		System.out.println("petrol");
	}
}

interface u_car
{
	int add (int i, int j);
	public static void run()
	{
		System.out.println("U am running....");
	}
	
	public default void eat()
	{
		System.out.println("disel");
	}
}
class nano implements  u_car,I_car
{

	@Override
	public int add(int i, int j) {
		
		return 0;
	}
	
	
	public  void run()
	{
	I_car.run();
	u_car.run();
	
	}
	
	public void eat(int k)
	{
		System.out.println("eat of nano");
		
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		I_car.super.eat();
	}


	
	
}
