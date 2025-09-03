package string;

public class First {

	public static void main(String[] args) {
	
		Demo d=new Demo();
		
		
		String num=d.display();//num=<="100"
		System.out.println(num+100);
	}

}


class Demo
{
	int age=34; //property
	
	public String display() //Method
//accessmodifier returntype methodname()
	{
		//System.out.println("hii");
		
		return "100";
	}
	
	
	public int returnint()
	{
		return 100;
	}
	
	public char returnchar()
	{
		return 'a';
	}
}