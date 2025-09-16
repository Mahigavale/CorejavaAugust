package initial;

public class Third {

	public static void main(String[] args) {

		Fourth fourth=new Fourth(10,10); //constructor
		
		
		fourth.greet();
	}
}


class Fourth
{
	
	//non-paramterized constructor
//	public Fourth()
//	{
//		System.out.println("constructor called.....");
//	}
	
	
	
	//parameterized
	public Fourth(int i, int j)
	{
		System.out.println(i+j);
	}
	
	
	public String display()
	{
		return "100.0";
	}
	
	public void greet()
	{
		System.out.println("welcome.....");
	}
	

}