package initial;

public class First {

	public static void main(String[] args) {
		
		Second sec=new Second();
		
		System.out.println(sec.getnum());
	}
}


class Second
{
	
	public Second()
	{
		System.out.println("inside constructor");
	}
	int age; //data member //instance variable
	
	
	public int getnum()   //member function
	{
		return 100;
	}
	

}