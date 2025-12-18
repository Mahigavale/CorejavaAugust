package copying;

import java.io.Closeable;

import java.util.Scanner;

public class Deep_Struct {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		Address address=new Address("411052","Pune");
		Order order=new Order(1399,"Aviator",address);
		
		System.out.println(order);
		
		Order order2=(Order)order.clone();
		
		System.out.println(order2);
		
		order2.item="Tees";
		System.out.println("1"+order);
		System.out.println("2:"+order2);
		
		order2.adress.pincode="111111";
		order2.adress.city="Mumbai";
		
		System.out.println("&***************************00**);");
		System.out.println("One:"+order);
		System.out.println("Two:"+order2);
	}

}

class  Order implements Cloneable
{
	int  price;
	String item;
	Address adress;
	public Order(int price, String item, Address adress) {
		super();
		this.price = price;
		this.item = item;
		this.adress = adress;
	}
	
	
	public  Object clone() throws CloneNotSupportedException
	{
		Order o2=(Order)super.clone();
		o2.adress=(Address)this.adress.clone();
		return o2;
	}
	
	public String toString()
	{
		return this.item+" "+this.price+" City Fields:"+this.adress.city+" "+this.adress.pincode;
	}
	
}

class Address implements Cloneable
{
	String pincode;
	String city;
	
	public Address(String pincode, String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}