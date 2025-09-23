package Inheritance;

public class Fifth {

	public static void main(String[] args) {
	
		Indigo indigo=new Indigo();
		indigo.human_life();
		
		
	}
}
class Human_1{
	public Human_1()
	{
		System.out.println("hello");
	}
	
	public void human_life()
	{
		
	}
}
class Aeroplane extends Human_1
{
	public Aeroplane()
	{
		
		System.out.println("A");
	}
	
	public Aeroplane(int i)
	{
	 this();
		System.out.println("B");
	}
}

class Indigo extends Aeroplane
{
	public Indigo()
	{
		/**
		 * Such constructor  of super class which is taking single int param
		 */
		super(12);
		
		System.out.println("C");
	}
	
	
}