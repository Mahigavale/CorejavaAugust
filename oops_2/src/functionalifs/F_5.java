package functionalifs;

public class F_5 {

	public static void main(String[] args) {

		Demo_ d=new Demo_();

		Demo_a a=new Demo_a();
		
		a.add(10);
		a.add(123, 123);
	}
}
class Demo_
{
//	public Demo_()
//	{
//		this(10);
//	}
	
	private Demo_(int i)
	{
		System.out.println(i);
	}
	Demo_()
	{
		this(10);
		
	}
	
	/**
	 * public, private and protected.
	 */
	
	final public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i)
	{
		
	}
	
}

class Demo_a extends Demo_
{
	public void add(int k)
	{
		
	}
}