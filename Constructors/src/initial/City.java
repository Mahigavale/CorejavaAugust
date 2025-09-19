package initial;

public class City {

	public static void main(String[] args) {
		
		Bus bus=new Bus();
		
		
		/**
		 * setter =>SI
		 * constructor=>CI
		 */
		//set => Set first
		bus.setBusName("Anthony");
		bus.setBusNumber(123);
		//get => Get later
		//System.out.println(bus.busname);
		//System.out.println(bus.busnumber);
		System.out.println(bus.getbusname());
		System.out.println(bus.getnumber());
	}

}


class Bus
{
	int busnumber;
	String busname;
	
	public void setBusNumber(int num)
	{
		this.busnumber=num; //setting the values
	}
	
	public void setBusName(String name)
	{
		this.busname=name;
	}
	
	public int getnumber()
	{
		return this.busnumber;
	}
	
	public String getbusname()
	{
		return this.busname;
	}
}