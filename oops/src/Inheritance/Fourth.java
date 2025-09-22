package Inheritance;

public class Fourth {

	public static void main(String[] args) {
		
     Demo d=new Demo();
    // System.out.println(d.id);
	}

}

class Demo
{
	int id;

	
	public Demo()
	{ 
		this(12,23);
		System.out.println("One");
		this.id=120;
	}
	public Demo(int i)
	{
		//this(100,2000);
		System.out.println("two");
	}
	public Demo(int i, int j)
	{
		this(200);
		 System.out.println("three");
	}
}