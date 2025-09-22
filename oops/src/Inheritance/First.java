package Inheritance;

public class First {

	public static void main(String[] args) {
		
		//Atharva at=new Atharva();
		
		
		Human human=new Atharva();
		
		//human.ci
		
		//Atharva at=new Human();
	

	}

}

class Human
{
	
	public void walk()
	{
		System.out.println("human is walking...");
	}
	
	public void laugh()
	{
		System.out.println("he is laughing");
	}
}

/**
 * IS-A relation.
 */
class Atharva extends Human
{
//	public void city()
//	{
//		System.out.println("pune");
//	}
	
}