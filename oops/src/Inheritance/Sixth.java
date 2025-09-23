package Inheritance;

public class Sixth {

	public static void main(String[] args) {
		
		Two_wheeler two=new Two_wheeler("Harley_Davidson");
	}

}

class Vehicle
{
	String name;
	
	public Vehicle(String name)
	{
		this.name=name;
		System.out.println("value assigned in the super class:"+name);
	}
	
}
class Four_wheeler extends Vehicle
{
	
	public Four_wheeler(String name)
	{
		super(name);
	}
}

class Three_wheeler extends Four_wheeler
{
	public Three_wheeler(String name)
	{
		super(name);
	}

}

class Two_wheeler extends Three_wheeler
{
	public Two_wheeler(String name)
	{
		super(name.toUpperCase());
		
		//String str2=name.toUpperCase();
	}
}