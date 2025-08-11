package core2;

public class Instance {

	public static void main(String[] args) {
		
		Car swift=new Car();
		
		swift.driving();
		swift.stop();
		
		System.out.println(swift.price);
		
	}

}

class Car
{
	double price=34334.67;
	public void driving()
	{
		
		System.out.println("car is running....");
		System.out.println(price);
	}
	
	public void stop()
	{
		System.out.println("car has stopped....");
		System.out.println(price);
	}
}