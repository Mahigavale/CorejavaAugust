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
	
	}
