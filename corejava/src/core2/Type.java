package core2;

public class Type {
    int age2=56;
	public static void main(String[] args) {
		
		int age=45;
		
		Aeroplane aero=new Aeroplane();
		System.out.println(aero.nameaero);
		
		Bus bus=new Bus();
		bus.start();
		
		
		
		
		Truck truck=new Truck();
		System.out.println(truck.nametruck);
		
	}
}

class Aeroplane
{
 String nameaero="Boeing";	 //instance
}
class Bus
{
	
	public void start()
	{
		String name="Leyland"; //local
		System.out.println(name);
	}
}
class Truck
{
	String nametruck="Volvo";  //instance
	
}