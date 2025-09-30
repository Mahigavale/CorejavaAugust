package abstraction;

public class Ab_2 {

	public static void main(String[] args) {		
		
		City city=new City() {
			
			public void showpincode(String s)
			{
				System.out.println("hello:::"+s);
			}
			
			public void run_2()
			{
				System.out.println("running...");
			}
			
		};
		
		
		city.show();
		city.showpincode("12342");
		
		
	}	

}

abstract class City
{
	String name;
	public void show()
	{
		System.out.println(this.name);
		
	}
	
//	public City(String name)
//	{
//		this.name=name;
//	}
	
	 abstract public void showpincode(String pin);
	 
	 
	
}
//
//class Pune extends City
//{
//
//	@Override
//	public void showpincode(String pin) {
//		// TODO Auto-generated method stub
//	
//		System.out.println("child class");
//	}
//	
//}
//
