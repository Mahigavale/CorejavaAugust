package Inheritance;

public class Second {

	public static void main(String[] args) {
		
		//Animal animal=new Animal();
		
		//Tiger tiger=new Tiger();
		BengalTiger bt=new BengalTiger();
	}

}


class Animal
{
	public Animal()
	{
		System.out.println("Invoked....");
	}
	
	public void demo()
	{
		System.out.println("From animal...");
	}
}

class Tiger extends Animal
{
	public Tiger()
	{
		System.out.println("Tiger invoked...");
	}
	
	
}
class BengalTiger extends Tiger
{
	public BengalTiger()
	{
		System.out.println("Indian..");
	}
}