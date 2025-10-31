package objectC;

public class Amazon_Order {

	public static void main(String[] args)  {
		

		
	
		//Order order=new Order(Adress_Object.getObj());
		
		try {
		Order order=new Order(null);
		order.date="32/32/2032";
		order.price=456.90;
		order.items=new String[]{"Tv","Laptop"};
		
	
		//order.address=adress;
		
		
		
		
		order.DispatchOrder();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
	//	System.out.println(order);//toString();
	}
}

class Order
{
	double price;
	String[]items;
	String date;
	
	Address address;
	/**
	 * Order HAS-A address.
	 * Order => dependent on address.
	 * @param adress
	 */
	
	
	public Order(Address adress) throws NullAdressException{
		if(adress==null)
		{
			throw new NullAdressException();
		}
		address=adress;
		
	}
	
	public String toString()
	{
		return this.date+" "+this.price;
	}
	
	public void DispatchOrder()
	{
		System.out.println("order dispathced to address :"+address);
	}
}
class Address
{
	String city;
	String pincode;
	String mobile;
	String landmark;
	public String toString()
	
	{
		return  "Address is :"+ this.city +" "+this.pincode+" "+this.mobile+" "+this.landmark;
	}
}


class Adress_Object
{
	public  static Address getObj()
	{
		Address adress=new Address();
		adress.city="pune";
		adress.mobile="11223344";
		adress.pincode="343434";
		adress.landmark="Karve Nagar";
		
		System.out.println(adress);
		return adress;
	}
}

class NullAdressException extends Exception
{
	public NullAdressException()
	{
		super("neat address de be !");
	}
}