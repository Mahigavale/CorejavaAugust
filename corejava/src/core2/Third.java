package core2;

public class Third {

	public static void main(String[] args) {
		


		Animal animal=new Animal();
		animal.run();
		animal.eat();
	}

}

class Animal
{
	
	public void run()
	{
		String name="Tiger";
		System.out.println("it is running.....");
		System.out.println(name);
	}
	
	
	public void eat()
	{
		String food="grass";
		
		System.out.println("animal is eating...");
		System.out.println(food);
	}
	
	
		int i=23;//local
		
//		Car  car=new Car(); //(); //instance or Object of Car
//		
//		car.stop();
//		car.run();
//		 System.out.println(car.age);
		
	
	}
	
	


class Car1
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

