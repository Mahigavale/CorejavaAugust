package initial;

public class Animal {

	public static void main(String[] args) {
	
     Tiger tiger=new Tiger();
	}
}

class Tiger
{
	//1 constructor=> JAVA
	//non-param
	public Tiger() //
	{
		 //Constructor
		System.out.println("NON_PARAM");
	}
	
	public Tiger(int i, String j, char c) //i
	{
		System.out.println(i+"PARAM");
		System.out.println(j);
		System.out.println(c);
	}
	
	public Tiger(int i, int j) //i,j
	{
		System.out.println(i+j+"TWO params");
	}
	
	public Tiger(String abc) //"i"
	{
		System.out.println(abc);
	}
}