package runtime;

public class First {

	public static void main(String[] args) {
		
		Animal animal=new Tiger();
		
		animal.show();
	}
}

/**
 * overriding=> iff the return type is primitive or void => you can't
 * other=> possible.
 */
class Animal
{
	
	public Demo show()
	{
		System.out.println("show method of the animal....");
		return new Demo();
	}
}
class Tiger extends Animal
{
	
	public  Demo show()
	{
		System.out.println("show method of the tiger...");
	return (Demo)new Object();	
	}
}

class Demo
{
	
}

class Demo1 extends Demo
{
	
}

class Demo2 extends Demo1
{
	
}
