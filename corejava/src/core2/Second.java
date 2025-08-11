package core2;

public class Second {

	public static void main(String[] args) {
		
		int age=100;
		System.out.println(age);
		
		Demo d=new Demo(); //d is the instance Demo.
		d.demo();
		d.eat();
		
	}

}

class Demo
{
	public void demo()
	{
		System.out.println("demo...");
	}
	public void eat()
	{
		
		System.out.println("eating...");
	}
	
	public void eatery()
	{
		System.out.println("going out...");
	}
}
