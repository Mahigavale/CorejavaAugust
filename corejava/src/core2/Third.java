package core2;

public class Third {

	public static void main(String[] args) {
		
		int i=23;//local
		
		Car  car=new Car(); //(); //instance or Object of Car
		
		car.stop();
		car.run();
		 System.out.println(car.age);
		
	
	}
	
	
}

class Car
{
	int age=35;   //Instance/Object Variable
	
	 //instance variable
	public void run()
	{
		float carprice=3455.67f;
		System.out.println(carprice);
		
		System.out.println("car is running");
	}
	
	public void stop()
	{
		//System.out.println(carprice);
		System.out.println("car has stopped");
	}
}