package polymorphism;

public class First {

	public static void main(String[] args) {

		Animal animal=new Animal();
		
		animal.run(12.0f,13);
	}
}

class Animal
{
	int age=23;
	//int age=34;
	public void run() //()
	{
		this.age=35;
		System.out.println("Running animal...");
	}
	
	public String run(int j) //(i)
	{
		System.out.println("RUN:2");
		return null;
	}
	
//	public void run(int k,int l)
//	{
//		System.out.println("RUN:3");
//	}
	
	public void run(double d, int m)
	{
		
	}
//		
//	}
}