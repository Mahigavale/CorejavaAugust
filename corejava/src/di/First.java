package di;

public class First {

	public static void main(String[] args) {
		
		
		Third third=new Third();
		
		Second second=new Second(third);
		
		
		second.add(100);
	}

}

@Hero
class Second
{
	Third third;  //DI=> D Injection
	
	public Second(Third third)
	{
		this.third=third;  //DI using the CI
	}
	
	public void add(int i)
	{
		 System.out.println("Add:"+(third.getnum()+i));
	}
	
	
}

@Villain
class Third 
{
	
	
	public int getnum()
	{
		return 100;
	}
}