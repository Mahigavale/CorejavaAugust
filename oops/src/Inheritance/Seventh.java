package Inheritance;

public class Seventh {

	public static void main(String[] args) {
		
		Lambo hurricane=new Lambo();
		//Super_cars car=new Lambo();
		hurricane.start_children();
	
			
	}

}

class Super_cars
{
	 String engine=".90L Diesel";
	String hp;
	public void Start() {
		System.out.println("Car Started...");
		
	}
	
	public Super_cars(String hp)
	{
		
		this.setHp(hp);
		System.out.println("Parent class accessed.");
	}
	
	public void setHp(String hp)
	{
		this.hp=hp;
	}
	
	public String getHp()
	{
		return this.hp;
	}
	
}

class Lambo extends Super_cars
{
	
	String engine_1=super.engine;
	public Lambo()
	{
		super("100hp");
//		super.Start();
//		System.out.println(super.engine);
//		System.out.println(this.engine);
//		System.out.println(this.engine_1);
//		
		
	//	System.out.println("Getting the HP's:");
		
	//	System.out.println(super.getHp());
		System.out.println("Child class accessed.");
		
	
	}
	
	public void start_children() {
		super.Start();
		System.out.println(super.engine);
		System.out.println(this.engine);
		System.out.println(this.engine_1);
		
		
		System.out.println("Getting the HP's:");
		
		System.out.println(super.getHp());
	}
	
	
}