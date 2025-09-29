package abstraction;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * Abstract=> Incomplete.
		 * Two Mechanism's=>
		 * 1)Abstract class.
		 * 2)An Interface.
		 */
		
		
              Company com=Company.getObj();
	}
}

class Company
{
	int id;
	String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		
		
		return this.name;
	}
	
	
	public static Company getObj() throws InterruptedException
	{
		
		
		return new Company();
	}
	
	public Company()
	{
		System.out.println("Object created.....");
	}
}
