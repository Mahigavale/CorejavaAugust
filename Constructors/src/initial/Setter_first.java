package initial;

public class Setter_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Creating Object:calling const.");
		House house=new House(10,"Guru Krupa","Maniyar Galli");
		/**
		 * Constructor call => new Classname();
		 */
		
		System.out.println(house.house_lane);
		System.out.println(house.house_number);
		System.out.println(house.house_name);
		
		
		house.displayhousename();
	}

}


class House
{
	int house_number;
	String house_name;
	String house_lane;
	/**
	 * Instance variable:=> Default values.
	 * constructor Injection => set values to instance variable.
	 */
	
	//House(int,String,String);
	public House(int num,String name,String lane) {
	
		this.house_lane=lane;
		this.house_number=num;
		this.house_name=name;
		//System.out.println("hello");
	}
	
	public void displayhousename()
	{
		System.out.println("the name of the house is:"+this.house_name);
	}
	
}