package polymorphism;

public class Cons_overload {

	public static void main(String[] args) {

	}
}

class Order
{
	String name=null;
	String mobile=null;
	double o_price=0.0;
	String pincode=null;
	String city=null;
	
	public Order(String nam, String pin , String mob)
	{
		this.name=nam;
		
	}
	
	public Order(String nam, String pin, String mob, double price)
	{
		
	}
	
}