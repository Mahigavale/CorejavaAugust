package oops_2;

public class Demo_2 {

	public static void main(String[] args) {
		
		
		
		Kartik.showclass();
		Actor.showclass();
	}
}


class Actor
{
	
	public   static void showclass()
	
	{
		System.out.println("This is the actor class..");
	}
	
}

class Kartik extends Actor
{
	public  static void showclass()
	{
		System.out.println("are helloooo!");
	}
	
	
}