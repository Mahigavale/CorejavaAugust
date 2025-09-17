package initial;

public class Flipkart {

	public static void main(String[] args) {
		
  
		
		// how , when and who can create the Object.
		Order order=new Order("Saheb","9191919191");
		
		
		order.deliver();
		System.out.println(order.pan);
	}

}
class Order
{
	String name;
	String city;
	String pincode;
	String mobile;
	double price;
	String aadhar;
	String pan;
	String vehiclenum;
	
	
	public Order(String cus_name, String cus_mobile)
	{
		this.name=cus_name;
		this.mobile=cus_mobile;
	}
	
	public void deliver()
	{
		System.out.println("order delivered to:"+this.name);
	}
}